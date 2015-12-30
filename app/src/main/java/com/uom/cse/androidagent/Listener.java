package com.uom.cse.androidagent;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.uom.cse.androidagent.central_node_services.RegisterDeviceClient;
import com.uom.cse.androidagent.central_node_services.ThriftAgentProcessInfo;
import com.uom.cse.androidagent.info.RAMUsageInfo;
import com.uom.cse.androidagent.popups.RegisterDevicePop;

import java.util.ArrayList;
import java.util.List;

/**
 * Asper compatible listener
 */

public class Listener implements UpdateListener
{
    // Listener identificator
    private String label;
    // Access counter
    private long access;

    private Context context;

    /**
     * Constructor
     * @param label
     */
    public Listener(String label,Context context)
    {

        this.label = label;
        this.context = context;
    }

    /**
     * Listener update method.
     * Retrives events generated by Asper
     * @param fresh
     * @param old
     */
    @Override
    public void update(EventBean[] fresh, EventBean[] old)
    {
        List<ThriftAgentProcessInfo> processedEventList = new ArrayList<>();
        for(EventBean eventBean:fresh){
            ThriftAgentProcessInfo processedEvents = new ThriftAgentProcessInfo();
            processedEvents.setName(eventBean.get("processName").toString());
            processedEvents.setPackageName(eventBean.get("packageName").toString());
            processedEvents.setCpuUsage(Double.parseDouble(eventBean.get("avgCPU").toString()));
            processedEvents.setRamUsage(Double.parseDouble(eventBean.get("avgRAM").toString()));
            processedEvents.setSentData(Double.parseDouble(eventBean.get("avgSent").toString()));
            processedEvents.setReceiveData(Double.parseDouble(eventBean.get("avgReceive").toString()));
            processedEvents.setMac(eventBean.get("mac").toString());
            processedEvents.setType("Android");
            processedEvents.setPid("pid");
            processedEventList.add(processedEvents);
        }
        RegisterDeviceClient.pushEvents(RegisterDevicePop.centralNodeIP.getText().toString(),
                Integer.parseInt(RegisterDevicePop.centralNodeport.getText().toString()),processedEventList);
        EventBean event = fresh[0];

        access++;
        Log.i("Asper Alert", "******************Desired event detected" + access);
        Message msgObj = MainActivity.handler.obtainMessage();
        Bundle b = new Bundle();
        String msg = "Summary of "+event.get("processName") + "\n";
        msg +=       "  Avg RAM usage - "+ event.get("avgRAM")+ "kB Avg CPU usage - " + event.get("avgCPU") + "%\n";

        b.putString("message", msg);
        msgObj.setData(b);
        MainActivity.handler2.sendMessage(msgObj);
        //Toast.makeText(context, "*****Alert from Asper: Criricla event detected", Toast.LENGTH_LONG).show();

    }

    public String getLabel()
    {
        return label;
    }

    public long getAccess()
    {
        return access;
    }
}
