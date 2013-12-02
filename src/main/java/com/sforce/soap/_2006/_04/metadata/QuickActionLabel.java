/**
 * QuickActionLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class QuickActionLabel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected QuickActionLabel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LogACall = "LogACall";
    public static final java.lang.String _LogANote = "LogANote";
    public static final java.lang.String _New = "New";
    public static final java.lang.String _NewRecordType = "NewRecordType";
    public static final java.lang.String _Update = "Update";
    public static final java.lang.String _NewChild = "NewChild";
    public static final java.lang.String _NewChildRecordType = "NewChildRecordType";
    public static final java.lang.String _CreateNew = "CreateNew";
    public static final java.lang.String _CreateNewRecordType = "CreateNewRecordType";
    public static final java.lang.String _QuickRecordType = "QuickRecordType";
    public static final java.lang.String _Quick = "Quick";
    public static final QuickActionLabel LogACall = new QuickActionLabel(_LogACall);
    public static final QuickActionLabel LogANote = new QuickActionLabel(_LogANote);
    public static final QuickActionLabel New = new QuickActionLabel(_New);
    public static final QuickActionLabel NewRecordType = new QuickActionLabel(_NewRecordType);
    public static final QuickActionLabel Update = new QuickActionLabel(_Update);
    public static final QuickActionLabel NewChild = new QuickActionLabel(_NewChild);
    public static final QuickActionLabel NewChildRecordType = new QuickActionLabel(_NewChildRecordType);
    public static final QuickActionLabel CreateNew = new QuickActionLabel(_CreateNew);
    public static final QuickActionLabel CreateNewRecordType = new QuickActionLabel(_CreateNewRecordType);
    public static final QuickActionLabel QuickRecordType = new QuickActionLabel(_QuickRecordType);
    public static final QuickActionLabel Quick = new QuickActionLabel(_Quick);
    public java.lang.String getValue() { return _value_;}
    public static QuickActionLabel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        QuickActionLabel enumeration = (QuickActionLabel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static QuickActionLabel fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuickActionLabel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "QuickActionLabel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
