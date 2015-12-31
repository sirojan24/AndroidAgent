package com.uom.cse.androidagent.central_node_services; /**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class Device implements org.apache.thrift.TBase<Device, Device._Fields>, java.io.Serializable, Cloneable, Comparable<Device> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Device");

  private static final org.apache.thrift.protocol.TField DEVICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("deviceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IPADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("IPAddress", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("group", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeviceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeviceTupleSchemeFactory());
  }

  public String deviceId; // required
  public String IPAddress; // required
  public String port; // required
  public String type; // required
  public String group; // required
  public String name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEVICE_ID((short)1, "deviceId"),
    IPADDRESS((short)2, "IPAddress"),
    PORT((short)3, "port"),
    TYPE((short)4, "type"),
    GROUP((short)5, "group"),
    NAME((short)6, "name");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DEVICE_ID
          return DEVICE_ID;
        case 2: // IPADDRESS
          return IPADDRESS;
        case 3: // PORT
          return PORT;
        case 4: // TYPE
          return TYPE;
        case 5: // GROUP
          return GROUP;
        case 6: // NAME
          return NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEVICE_ID, new org.apache.thrift.meta_data.FieldMetaData("deviceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IPADDRESS, new org.apache.thrift.meta_data.FieldMetaData("IPAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUP, new org.apache.thrift.meta_data.FieldMetaData("group", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Device.class, metaDataMap);
  }

  public Device() {
  }

  public Device(
    String deviceId,
    String IPAddress,
    String port,
    String type,
    String group,
    String name)
  {
    this();
    this.deviceId = deviceId;
    this.IPAddress = IPAddress;
    this.port = port;
    this.type = type;
    this.group = group;
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Device(Device other) {
    if (other.isSetDeviceId()) {
      this.deviceId = other.deviceId;
    }
    if (other.isSetIPAddress()) {
      this.IPAddress = other.IPAddress;
    }
    if (other.isSetPort()) {
      this.port = other.port;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetGroup()) {
      this.group = other.group;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
  }

  public Device deepCopy() {
    return new Device(this);
  }

  @Override
  public void clear() {
    this.deviceId = null;
    this.IPAddress = null;
    this.port = null;
    this.type = null;
    this.group = null;
    this.name = null;
  }

  public String getDeviceId() {
    return this.deviceId;
  }

  public Device setDeviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  public void unsetDeviceId() {
    this.deviceId = null;
  }

  /** Returns true if field deviceId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeviceId() {
    return this.deviceId != null;
  }

  public void setDeviceIdIsSet(boolean value) {
    if (!value) {
      this.deviceId = null;
    }
  }

  public String getIPAddress() {
    return this.IPAddress;
  }

  public Device setIPAddress(String IPAddress) {
    this.IPAddress = IPAddress;
    return this;
  }

  public void unsetIPAddress() {
    this.IPAddress = null;
  }

  /** Returns true if field IPAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetIPAddress() {
    return this.IPAddress != null;
  }

  public void setIPAddressIsSet(boolean value) {
    if (!value) {
      this.IPAddress = null;
    }
  }

  public String getPort() {
    return this.port;
  }

  public Device setPort(String port) {
    this.port = port;
    return this;
  }

  public void unsetPort() {
    this.port = null;
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean isSetPort() {
    return this.port != null;
  }

  public void setPortIsSet(boolean value) {
    if (!value) {
      this.port = null;
    }
  }

  public String getType() {
    return this.type;
  }

  public Device setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getGroup() {
    return this.group;
  }

  public Device setGroup(String group) {
    this.group = group;
    return this;
  }

  public void unsetGroup() {
    this.group = null;
  }

  /** Returns true if field group is set (has been assigned a value) and false otherwise */
  public boolean isSetGroup() {
    return this.group != null;
  }

  public void setGroupIsSet(boolean value) {
    if (!value) {
      this.group = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public Device setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEVICE_ID:
      if (value == null) {
        unsetDeviceId();
      } else {
        setDeviceId((String)value);
      }
      break;

    case IPADDRESS:
      if (value == null) {
        unsetIPAddress();
      } else {
        setIPAddress((String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case GROUP:
      if (value == null) {
        unsetGroup();
      } else {
        setGroup((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEVICE_ID:
      return getDeviceId();

    case IPADDRESS:
      return getIPAddress();

    case PORT:
      return getPort();

    case TYPE:
      return getType();

    case GROUP:
      return getGroup();

    case NAME:
      return getName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEVICE_ID:
      return isSetDeviceId();
    case IPADDRESS:
      return isSetIPAddress();
    case PORT:
      return isSetPort();
    case TYPE:
      return isSetType();
    case GROUP:
      return isSetGroup();
    case NAME:
      return isSetName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Device)
      return this.equals((Device)that);
    return false;
  }

  public boolean equals(Device that) {
    if (that == null)
      return false;

    boolean this_present_deviceId = true && this.isSetDeviceId();
    boolean that_present_deviceId = true && that.isSetDeviceId();
    if (this_present_deviceId || that_present_deviceId) {
      if (!(this_present_deviceId && that_present_deviceId))
        return false;
      if (!this.deviceId.equals(that.deviceId))
        return false;
    }

    boolean this_present_IPAddress = true && this.isSetIPAddress();
    boolean that_present_IPAddress = true && that.isSetIPAddress();
    if (this_present_IPAddress || that_present_IPAddress) {
      if (!(this_present_IPAddress && that_present_IPAddress))
        return false;
      if (!this.IPAddress.equals(that.IPAddress))
        return false;
    }

    boolean this_present_port = true && this.isSetPort();
    boolean that_present_port = true && that.isSetPort();
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (!this.port.equals(that.port))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_group = true && this.isSetGroup();
    boolean that_present_group = true && that.isSetGroup();
    if (this_present_group || that_present_group) {
      if (!(this_present_group && that_present_group))
        return false;
      if (!this.group.equals(that.group))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_deviceId = true && (isSetDeviceId());
    list.add(present_deviceId);
    if (present_deviceId)
      list.add(deviceId);

    boolean present_IPAddress = true && (isSetIPAddress());
    list.add(present_IPAddress);
    if (present_IPAddress)
      list.add(IPAddress);

    boolean present_port = true && (isSetPort());
    list.add(present_port);
    if (present_port)
      list.add(port);

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_group = true && (isSetGroup());
    list.add(present_group);
    if (present_group)
      list.add(group);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    return list.hashCode();
  }

  @Override
  public int compareTo(Device other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDeviceId()).compareTo(other.isSetDeviceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeviceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deviceId, other.deviceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIPAddress()).compareTo(other.isSetIPAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIPAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.IPAddress, other.IPAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPort()).compareTo(other.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroup()).compareTo(other.isSetGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.group, other.group);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Device(");
    boolean first = true;

    sb.append("deviceId:");
    if (this.deviceId == null) {
      sb.append("null");
    } else {
      sb.append(this.deviceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("IPAddress:");
    if (this.IPAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.IPAddress);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    if (this.port == null) {
      sb.append("null");
    } else {
      sb.append(this.port);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("group:");
    if (this.group == null) {
      sb.append("null");
    } else {
      sb.append(this.group);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DeviceStandardSchemeFactory implements SchemeFactory {
    public DeviceStandardScheme getScheme() {
      return new DeviceStandardScheme();
    }
  }

  private static class DeviceStandardScheme extends StandardScheme<Device> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Device struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEVICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deviceId = iprot.readString();
              struct.setDeviceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IPADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.IPAddress = iprot.readString();
              struct.setIPAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.port = iprot.readString();
              struct.setPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.group = iprot.readString();
              struct.setGroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Device struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.deviceId != null) {
        oprot.writeFieldBegin(DEVICE_ID_FIELD_DESC);
        oprot.writeString(struct.deviceId);
        oprot.writeFieldEnd();
      }
      if (struct.IPAddress != null) {
        oprot.writeFieldBegin(IPADDRESS_FIELD_DESC);
        oprot.writeString(struct.IPAddress);
        oprot.writeFieldEnd();
      }
      if (struct.port != null) {
        oprot.writeFieldBegin(PORT_FIELD_DESC);
        oprot.writeString(struct.port);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeString(struct.type);
        oprot.writeFieldEnd();
      }
      if (struct.group != null) {
        oprot.writeFieldBegin(GROUP_FIELD_DESC);
        oprot.writeString(struct.group);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeviceTupleSchemeFactory implements SchemeFactory {
    public DeviceTupleScheme getScheme() {
      return new DeviceTupleScheme();
    }
  }

  private static class DeviceTupleScheme extends TupleScheme<Device> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Device struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDeviceId()) {
        optionals.set(0);
      }
      if (struct.isSetIPAddress()) {
        optionals.set(1);
      }
      if (struct.isSetPort()) {
        optionals.set(2);
      }
      if (struct.isSetType()) {
        optionals.set(3);
      }
      if (struct.isSetGroup()) {
        optionals.set(4);
      }
      if (struct.isSetName()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetDeviceId()) {
        oprot.writeString(struct.deviceId);
      }
      if (struct.isSetIPAddress()) {
        oprot.writeString(struct.IPAddress);
      }
      if (struct.isSetPort()) {
        oprot.writeString(struct.port);
      }
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetGroup()) {
        oprot.writeString(struct.group);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Device struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.deviceId = iprot.readString();
        struct.setDeviceIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.IPAddress = iprot.readString();
        struct.setIPAddressIsSet(true);
      }
      if (incoming.get(2)) {
        struct.port = iprot.readString();
        struct.setPortIsSet(true);
      }
      if (incoming.get(3)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.group = iprot.readString();
        struct.setGroupIsSet(true);
      }
      if (incoming.get(5)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
    }
  }

}

