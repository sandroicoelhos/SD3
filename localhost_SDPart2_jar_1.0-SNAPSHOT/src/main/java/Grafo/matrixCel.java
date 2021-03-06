/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package Grafo;

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

public class matrixCel implements org.apache.thrift.TBase<matrixCel, matrixCel._Fields>, java.io.Serializable, Cloneable, Comparable<matrixCel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("matrixCel");

  private static final org.apache.thrift.protocol.TField F1_FIELD_DESC = new org.apache.thrift.protocol.TField("f1", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField F2_FIELD_DESC = new org.apache.thrift.protocol.TField("f2", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new matrixCelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new matrixCelTupleSchemeFactory());
  }

  public List<Finger> f1; // required
  public List<Finger> f2; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    F1((short)1, "f1"),
    F2((short)2, "f2");

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
        case 1: // F1
          return F1;
        case 2: // F2
          return F2;
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
    tmpMap.put(_Fields.F1, new org.apache.thrift.meta_data.FieldMetaData("f1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Finger.class))));
    tmpMap.put(_Fields.F2, new org.apache.thrift.meta_data.FieldMetaData("f2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Finger.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(matrixCel.class, metaDataMap);
  }

  public matrixCel() {
  }

  public matrixCel(
    List<Finger> f1,
    List<Finger> f2)
  {
    this();
    this.f1 = f1;
    this.f2 = f2;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public matrixCel(matrixCel other) {
    if (other.isSetF1()) {
      List<Finger> __this__f1 = new ArrayList<Finger>(other.f1.size());
      for (Finger other_element : other.f1) {
        __this__f1.add(new Finger(other_element));
      }
      this.f1 = __this__f1;
    }
    if (other.isSetF2()) {
      List<Finger> __this__f2 = new ArrayList<Finger>(other.f2.size());
      for (Finger other_element : other.f2) {
        __this__f2.add(new Finger(other_element));
      }
      this.f2 = __this__f2;
    }
  }

  public matrixCel deepCopy() {
    return new matrixCel(this);
  }

  @Override
  public void clear() {
    this.f1 = null;
    this.f2 = null;
  }

  public int getF1Size() {
    return (this.f1 == null) ? 0 : this.f1.size();
  }

  public java.util.Iterator<Finger> getF1Iterator() {
    return (this.f1 == null) ? null : this.f1.iterator();
  }

  public void addToF1(Finger elem) {
    if (this.f1 == null) {
      this.f1 = new ArrayList<Finger>();
    }
    this.f1.add(elem);
  }

  public List<Finger> getF1() {
    return this.f1;
  }

  public matrixCel setF1(List<Finger> f1) {
    this.f1 = f1;
    return this;
  }

  public void unsetF1() {
    this.f1 = null;
  }

  /** Returns true if field f1 is set (has been assigned a value) and false otherwise */
  public boolean isSetF1() {
    return this.f1 != null;
  }

  public void setF1IsSet(boolean value) {
    if (!value) {
      this.f1 = null;
    }
  }

  public int getF2Size() {
    return (this.f2 == null) ? 0 : this.f2.size();
  }

  public java.util.Iterator<Finger> getF2Iterator() {
    return (this.f2 == null) ? null : this.f2.iterator();
  }

  public void addToF2(Finger elem) {
    if (this.f2 == null) {
      this.f2 = new ArrayList<Finger>();
    }
    this.f2.add(elem);
  }

  public List<Finger> getF2() {
    return this.f2;
  }

  public matrixCel setF2(List<Finger> f2) {
    this.f2 = f2;
    return this;
  }

  public void unsetF2() {
    this.f2 = null;
  }

  /** Returns true if field f2 is set (has been assigned a value) and false otherwise */
  public boolean isSetF2() {
    return this.f2 != null;
  }

  public void setF2IsSet(boolean value) {
    if (!value) {
      this.f2 = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case F1:
      if (value == null) {
        unsetF1();
      } else {
        setF1((List<Finger>)value);
      }
      break;

    case F2:
      if (value == null) {
        unsetF2();
      } else {
        setF2((List<Finger>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case F1:
      return getF1();

    case F2:
      return getF2();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case F1:
      return isSetF1();
    case F2:
      return isSetF2();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof matrixCel)
      return this.equals((matrixCel)that);
    return false;
  }

  public boolean equals(matrixCel that) {
    if (that == null)
      return false;

    boolean this_present_f1 = true && this.isSetF1();
    boolean that_present_f1 = true && that.isSetF1();
    if (this_present_f1 || that_present_f1) {
      if (!(this_present_f1 && that_present_f1))
        return false;
      if (!this.f1.equals(that.f1))
        return false;
    }

    boolean this_present_f2 = true && this.isSetF2();
    boolean that_present_f2 = true && that.isSetF2();
    if (this_present_f2 || that_present_f2) {
      if (!(this_present_f2 && that_present_f2))
        return false;
      if (!this.f2.equals(that.f2))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(matrixCel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetF1()).compareTo(other.isSetF1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetF1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.f1, other.f1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetF2()).compareTo(other.isSetF2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetF2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.f2, other.f2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("matrixCel(");
    boolean first = true;

    sb.append("f1:");
    if (this.f1 == null) {
      sb.append("null");
    } else {
      sb.append(this.f1);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("f2:");
    if (this.f2 == null) {
      sb.append("null");
    } else {
      sb.append(this.f2);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class matrixCelStandardSchemeFactory implements SchemeFactory {
    public matrixCelStandardScheme getScheme() {
      return new matrixCelStandardScheme();
    }
  }

  private static class matrixCelStandardScheme extends StandardScheme<matrixCel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, matrixCel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // F1
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list10 = iprot.readListBegin();
                struct.f1 = new ArrayList<Finger>(_list10.size);
                for (int _i11 = 0; _i11 < _list10.size; ++_i11)
                {
                  Finger _elem12;
                  _elem12 = new Finger();
                  _elem12.read(iprot);
                  struct.f1.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setF1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // F2
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list13 = iprot.readListBegin();
                struct.f2 = new ArrayList<Finger>(_list13.size);
                for (int _i14 = 0; _i14 < _list13.size; ++_i14)
                {
                  Finger _elem15;
                  _elem15 = new Finger();
                  _elem15.read(iprot);
                  struct.f2.add(_elem15);
                }
                iprot.readListEnd();
              }
              struct.setF2IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, matrixCel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.f1 != null) {
        oprot.writeFieldBegin(F1_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.f1.size()));
          for (Finger _iter16 : struct.f1)
          {
            _iter16.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.f2 != null) {
        oprot.writeFieldBegin(F2_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.f2.size()));
          for (Finger _iter17 : struct.f2)
          {
            _iter17.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class matrixCelTupleSchemeFactory implements SchemeFactory {
    public matrixCelTupleScheme getScheme() {
      return new matrixCelTupleScheme();
    }
  }

  private static class matrixCelTupleScheme extends TupleScheme<matrixCel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, matrixCel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetF1()) {
        optionals.set(0);
      }
      if (struct.isSetF2()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetF1()) {
        {
          oprot.writeI32(struct.f1.size());
          for (Finger _iter18 : struct.f1)
          {
            _iter18.write(oprot);
          }
        }
      }
      if (struct.isSetF2()) {
        {
          oprot.writeI32(struct.f2.size());
          for (Finger _iter19 : struct.f2)
          {
            _iter19.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, matrixCel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list20 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.f1 = new ArrayList<Finger>(_list20.size);
          for (int _i21 = 0; _i21 < _list20.size; ++_i21)
          {
            Finger _elem22;
            _elem22 = new Finger();
            _elem22.read(iprot);
            struct.f1.add(_elem22);
          }
        }
        struct.setF1IsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.f2 = new ArrayList<Finger>(_list23.size);
          for (int _i24 = 0; _i24 < _list23.size; ++_i24)
          {
            Finger _elem25;
            _elem25 = new Finger();
            _elem25.read(iprot);
            struct.f2.add(_elem25);
          }
        }
        struct.setF2IsSet(true);
      }
    }
  }

}

