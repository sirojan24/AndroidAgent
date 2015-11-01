/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.uom.cse.androidagent.thriftGeneratedCode;

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
public class TProcessInfo implements org.apache.thrift.TBase<TProcessInfo, TProcessInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TProcessInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TProcessInfo");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PACKAGE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("packageName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SHARED_RAMUSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("sharedRAMUsage", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PROCESS_CPUUSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("processCPUUsage", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField INTERNET_USAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("internetUsage", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PRIVATE_RAMUSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("privateRAMUsage", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TProcessInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TProcessInfoTupleSchemeFactory());
  }

  public String name; // required
  public String packageName; // required
  public String sharedRAMUsage; // required
  public String processCPUUsage; // required
  public String internetUsage; // required
  public String privateRAMUsage; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    PACKAGE_NAME((short)2, "packageName"),
    SHARED_RAMUSAGE((short)3, "sharedRAMUsage"),
    PROCESS_CPUUSAGE((short)4, "processCPUUsage"),
    INTERNET_USAGE((short)5, "internetUsage"),
    PRIVATE_RAMUSAGE((short)6, "privateRAMUsage");

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
        case 1: // NAME
          return NAME;
        case 2: // PACKAGE_NAME
          return PACKAGE_NAME;
        case 3: // SHARED_RAMUSAGE
          return SHARED_RAMUSAGE;
        case 4: // PROCESS_CPUUSAGE
          return PROCESS_CPUUSAGE;
        case 5: // INTERNET_USAGE
          return INTERNET_USAGE;
        case 6: // PRIVATE_RAMUSAGE
          return PRIVATE_RAMUSAGE;
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
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PACKAGE_NAME, new org.apache.thrift.meta_data.FieldMetaData("packageName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHARED_RAMUSAGE, new org.apache.thrift.meta_data.FieldMetaData("sharedRAMUsage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROCESS_CPUUSAGE, new org.apache.thrift.meta_data.FieldMetaData("processCPUUsage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INTERNET_USAGE, new org.apache.thrift.meta_data.FieldMetaData("internetUsage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRIVATE_RAMUSAGE, new org.apache.thrift.meta_data.FieldMetaData("privateRAMUsage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TProcessInfo.class, metaDataMap);
  }

  public TProcessInfo() {
  }

  public TProcessInfo(
    String name,
    String packageName,
    String sharedRAMUsage,
    String processCPUUsage,
    String internetUsage,
    String privateRAMUsage)
  {
    this();
    this.name = name;
    this.packageName = packageName;
    this.sharedRAMUsage = sharedRAMUsage;
    this.processCPUUsage = processCPUUsage;
    this.internetUsage = internetUsage;
    this.privateRAMUsage = privateRAMUsage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TProcessInfo(TProcessInfo other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetPackageName()) {
      this.packageName = other.packageName;
    }
    if (other.isSetSharedRAMUsage()) {
      this.sharedRAMUsage = other.sharedRAMUsage;
    }
    if (other.isSetProcessCPUUsage()) {
      this.processCPUUsage = other.processCPUUsage;
    }
    if (other.isSetInternetUsage()) {
      this.internetUsage = other.internetUsage;
    }
    if (other.isSetPrivateRAMUsage()) {
      this.privateRAMUsage = other.privateRAMUsage;
    }
  }

  public TProcessInfo deepCopy() {
    return new TProcessInfo(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.packageName = null;
    this.sharedRAMUsage = null;
    this.processCPUUsage = null;
    this.internetUsage = null;
    this.privateRAMUsage = null;
  }

  public String getName() {
    return this.name;
  }

  public TProcessInfo setName(String name) {
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

  public String getPackageName() {
    return this.packageName;
  }

  public TProcessInfo setPackageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  public void unsetPackageName() {
    this.packageName = null;
  }

  /** Returns true if field packageName is set (has been assigned a value) and false otherwise */
  public boolean isSetPackageName() {
    return this.packageName != null;
  }

  public void setPackageNameIsSet(boolean value) {
    if (!value) {
      this.packageName = null;
    }
  }

  public String getSharedRAMUsage() {
    return this.sharedRAMUsage;
  }

  public TProcessInfo setSharedRAMUsage(String sharedRAMUsage) {
    this.sharedRAMUsage = sharedRAMUsage;
    return this;
  }

  public void unsetSharedRAMUsage() {
    this.sharedRAMUsage = null;
  }

  /** Returns true if field sharedRAMUsage is set (has been assigned a value) and false otherwise */
  public boolean isSetSharedRAMUsage() {
    return this.sharedRAMUsage != null;
  }

  public void setSharedRAMUsageIsSet(boolean value) {
    if (!value) {
      this.sharedRAMUsage = null;
    }
  }

  public String getProcessCPUUsage() {
    return this.processCPUUsage;
  }

  public TProcessInfo setProcessCPUUsage(String processCPUUsage) {
    this.processCPUUsage = processCPUUsage;
    return this;
  }

  public void unsetProcessCPUUsage() {
    this.processCPUUsage = null;
  }

  /** Returns true if field processCPUUsage is set (has been assigned a value) and false otherwise */
  public boolean isSetProcessCPUUsage() {
    return this.processCPUUsage != null;
  }

  public void setProcessCPUUsageIsSet(boolean value) {
    if (!value) {
      this.processCPUUsage = null;
    }
  }

  public String getInternetUsage() {
    return this.internetUsage;
  }

  public TProcessInfo setInternetUsage(String internetUsage) {
    this.internetUsage = internetUsage;
    return this;
  }

  public void unsetInternetUsage() {
    this.internetUsage = null;
  }

  /** Returns true if field internetUsage is set (has been assigned a value) and false otherwise */
  public boolean isSetInternetUsage() {
    return this.internetUsage != null;
  }

  public void setInternetUsageIsSet(boolean value) {
    if (!value) {
      this.internetUsage = null;
    }
  }

  public String getPrivateRAMUsage() {
    return this.privateRAMUsage;
  }

  public TProcessInfo setPrivateRAMUsage(String privateRAMUsage) {
    this.privateRAMUsage = privateRAMUsage;
    return this;
  }

  public void unsetPrivateRAMUsage() {
    this.privateRAMUsage = null;
  }

  /** Returns true if field privateRAMUsage is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivateRAMUsage() {
    return this.privateRAMUsage != null;
  }

  public void setPrivateRAMUsageIsSet(boolean value) {
    if (!value) {
      this.privateRAMUsage = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case PACKAGE_NAME:
      if (value == null) {
        unsetPackageName();
      } else {
        setPackageName((String)value);
      }
      break;

    case SHARED_RAMUSAGE:
      if (value == null) {
        unsetSharedRAMUsage();
      } else {
        setSharedRAMUsage((String)value);
      }
      break;

    case PROCESS_CPUUSAGE:
      if (value == null) {
        unsetProcessCPUUsage();
      } else {
        setProcessCPUUsage((String)value);
      }
      break;

    case INTERNET_USAGE:
      if (value == null) {
        unsetInternetUsage();
      } else {
        setInternetUsage((String)value);
      }
      break;

    case PRIVATE_RAMUSAGE:
      if (value == null) {
        unsetPrivateRAMUsage();
      } else {
        setPrivateRAMUsage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case PACKAGE_NAME:
      return getPackageName();

    case SHARED_RAMUSAGE:
      return getSharedRAMUsage();

    case PROCESS_CPUUSAGE:
      return getProcessCPUUsage();

    case INTERNET_USAGE:
      return getInternetUsage();

    case PRIVATE_RAMUSAGE:
      return getPrivateRAMUsage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case PACKAGE_NAME:
      return isSetPackageName();
    case SHARED_RAMUSAGE:
      return isSetSharedRAMUsage();
    case PROCESS_CPUUSAGE:
      return isSetProcessCPUUsage();
    case INTERNET_USAGE:
      return isSetInternetUsage();
    case PRIVATE_RAMUSAGE:
      return isSetPrivateRAMUsage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TProcessInfo)
      return this.equals((TProcessInfo)that);
    return false;
  }

  public boolean equals(TProcessInfo that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_packageName = true && this.isSetPackageName();
    boolean that_present_packageName = true && that.isSetPackageName();
    if (this_present_packageName || that_present_packageName) {
      if (!(this_present_packageName && that_present_packageName))
        return false;
      if (!this.packageName.equals(that.packageName))
        return false;
    }

    boolean this_present_sharedRAMUsage = true && this.isSetSharedRAMUsage();
    boolean that_present_sharedRAMUsage = true && that.isSetSharedRAMUsage();
    if (this_present_sharedRAMUsage || that_present_sharedRAMUsage) {
      if (!(this_present_sharedRAMUsage && that_present_sharedRAMUsage))
        return false;
      if (!this.sharedRAMUsage.equals(that.sharedRAMUsage))
        return false;
    }

    boolean this_present_processCPUUsage = true && this.isSetProcessCPUUsage();
    boolean that_present_processCPUUsage = true && that.isSetProcessCPUUsage();
    if (this_present_processCPUUsage || that_present_processCPUUsage) {
      if (!(this_present_processCPUUsage && that_present_processCPUUsage))
        return false;
      if (!this.processCPUUsage.equals(that.processCPUUsage))
        return false;
    }

    boolean this_present_internetUsage = true && this.isSetInternetUsage();
    boolean that_present_internetUsage = true && that.isSetInternetUsage();
    if (this_present_internetUsage || that_present_internetUsage) {
      if (!(this_present_internetUsage && that_present_internetUsage))
        return false;
      if (!this.internetUsage.equals(that.internetUsage))
        return false;
    }

    boolean this_present_privateRAMUsage = true && this.isSetPrivateRAMUsage();
    boolean that_present_privateRAMUsage = true && that.isSetPrivateRAMUsage();
    if (this_present_privateRAMUsage || that_present_privateRAMUsage) {
      if (!(this_present_privateRAMUsage && that_present_privateRAMUsage))
        return false;
      if (!this.privateRAMUsage.equals(that.privateRAMUsage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_packageName = true && (isSetPackageName());
    list.add(present_packageName);
    if (present_packageName)
      list.add(packageName);

    boolean present_sharedRAMUsage = true && (isSetSharedRAMUsage());
    list.add(present_sharedRAMUsage);
    if (present_sharedRAMUsage)
      list.add(sharedRAMUsage);

    boolean present_processCPUUsage = true && (isSetProcessCPUUsage());
    list.add(present_processCPUUsage);
    if (present_processCPUUsage)
      list.add(processCPUUsage);

    boolean present_internetUsage = true && (isSetInternetUsage());
    list.add(present_internetUsage);
    if (present_internetUsage)
      list.add(internetUsage);

    boolean present_privateRAMUsage = true && (isSetPrivateRAMUsage());
    list.add(present_privateRAMUsage);
    if (present_privateRAMUsage)
      list.add(privateRAMUsage);

    return list.hashCode();
  }

  @Override
  public int compareTo(TProcessInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetPackageName()).compareTo(other.isSetPackageName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPackageName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.packageName, other.packageName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSharedRAMUsage()).compareTo(other.isSetSharedRAMUsage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSharedRAMUsage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sharedRAMUsage, other.sharedRAMUsage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProcessCPUUsage()).compareTo(other.isSetProcessCPUUsage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcessCPUUsage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processCPUUsage, other.processCPUUsage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInternetUsage()).compareTo(other.isSetInternetUsage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInternetUsage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.internetUsage, other.internetUsage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrivateRAMUsage()).compareTo(other.isSetPrivateRAMUsage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivateRAMUsage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privateRAMUsage, other.privateRAMUsage);
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
    StringBuilder sb = new StringBuilder("TProcessInfo(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("packageName:");
    if (this.packageName == null) {
      sb.append("null");
    } else {
      sb.append(this.packageName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sharedRAMUsage:");
    if (this.sharedRAMUsage == null) {
      sb.append("null");
    } else {
      sb.append(this.sharedRAMUsage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("processCPUUsage:");
    if (this.processCPUUsage == null) {
      sb.append("null");
    } else {
      sb.append(this.processCPUUsage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("internetUsage:");
    if (this.internetUsage == null) {
      sb.append("null");
    } else {
      sb.append(this.internetUsage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("privateRAMUsage:");
    if (this.privateRAMUsage == null) {
      sb.append("null");
    } else {
      sb.append(this.privateRAMUsage);
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

  private static class TProcessInfoStandardSchemeFactory implements SchemeFactory {
    public TProcessInfoStandardScheme getScheme() {
      return new TProcessInfoStandardScheme();
    }
  }

  private static class TProcessInfoStandardScheme extends StandardScheme<TProcessInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TProcessInfo struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PACKAGE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.packageName = iprot.readString();
              struct.setPackageNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SHARED_RAMUSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sharedRAMUsage = iprot.readString();
              struct.setSharedRAMUsageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROCESS_CPUUSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.processCPUUsage = iprot.readString();
              struct.setProcessCPUUsageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INTERNET_USAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.internetUsage = iprot.readString();
              struct.setInternetUsageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PRIVATE_RAMUSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.privateRAMUsage = iprot.readString();
              struct.setPrivateRAMUsageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TProcessInfo struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.packageName != null) {
        oprot.writeFieldBegin(PACKAGE_NAME_FIELD_DESC);
        oprot.writeString(struct.packageName);
        oprot.writeFieldEnd();
      }
      if (struct.sharedRAMUsage != null) {
        oprot.writeFieldBegin(SHARED_RAMUSAGE_FIELD_DESC);
        oprot.writeString(struct.sharedRAMUsage);
        oprot.writeFieldEnd();
      }
      if (struct.processCPUUsage != null) {
        oprot.writeFieldBegin(PROCESS_CPUUSAGE_FIELD_DESC);
        oprot.writeString(struct.processCPUUsage);
        oprot.writeFieldEnd();
      }
      if (struct.internetUsage != null) {
        oprot.writeFieldBegin(INTERNET_USAGE_FIELD_DESC);
        oprot.writeString(struct.internetUsage);
        oprot.writeFieldEnd();
      }
      if (struct.privateRAMUsage != null) {
        oprot.writeFieldBegin(PRIVATE_RAMUSAGE_FIELD_DESC);
        oprot.writeString(struct.privateRAMUsage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TProcessInfoTupleSchemeFactory implements SchemeFactory {
    public TProcessInfoTupleScheme getScheme() {
      return new TProcessInfoTupleScheme();
    }
  }

  private static class TProcessInfoTupleScheme extends TupleScheme<TProcessInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TProcessInfo struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetPackageName()) {
        optionals.set(1);
      }
      if (struct.isSetSharedRAMUsage()) {
        optionals.set(2);
      }
      if (struct.isSetProcessCPUUsage()) {
        optionals.set(3);
      }
      if (struct.isSetInternetUsage()) {
        optionals.set(4);
      }
      if (struct.isSetPrivateRAMUsage()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetPackageName()) {
        oprot.writeString(struct.packageName);
      }
      if (struct.isSetSharedRAMUsage()) {
        oprot.writeString(struct.sharedRAMUsage);
      }
      if (struct.isSetProcessCPUUsage()) {
        oprot.writeString(struct.processCPUUsage);
      }
      if (struct.isSetInternetUsage()) {
        oprot.writeString(struct.internetUsage);
      }
      if (struct.isSetPrivateRAMUsage()) {
        oprot.writeString(struct.privateRAMUsage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TProcessInfo struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.packageName = iprot.readString();
        struct.setPackageNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sharedRAMUsage = iprot.readString();
        struct.setSharedRAMUsageIsSet(true);
      }
      if (incoming.get(3)) {
        struct.processCPUUsage = iprot.readString();
        struct.setProcessCPUUsageIsSet(true);
      }
      if (incoming.get(4)) {
        struct.internetUsage = iprot.readString();
        struct.setInternetUsageIsSet(true);
      }
      if (incoming.get(5)) {
        struct.privateRAMUsage = iprot.readString();
        struct.setPrivateRAMUsageIsSet(true);
      }
    }
  }

}

