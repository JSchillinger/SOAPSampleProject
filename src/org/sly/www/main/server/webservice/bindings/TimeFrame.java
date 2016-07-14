/**
 * TimeFrame.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sly.www.main.server.webservice.bindings;

public class TimeFrame implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TimeFrame(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _YEAR_TO_DATE = "YEAR_TO_DATE";
    public static final java.lang.String _LAST_01Y = "LAST_01Y";
    public static final java.lang.String _LAST_02Y = "LAST_02Y";
    public static final java.lang.String _LAST_03Y = "LAST_03Y";
    public static final java.lang.String _LAST_05Y = "LAST_05Y";
    public static final java.lang.String _LAST_10Y = "LAST_10Y";
    public static final java.lang.String _MAX_AVAILABLE = "MAX_AVAILABLE";
    public static final TimeFrame YEAR_TO_DATE = new TimeFrame(_YEAR_TO_DATE);
    public static final TimeFrame LAST_01Y = new TimeFrame(_LAST_01Y);
    public static final TimeFrame LAST_02Y = new TimeFrame(_LAST_02Y);
    public static final TimeFrame LAST_03Y = new TimeFrame(_LAST_03Y);
    public static final TimeFrame LAST_05Y = new TimeFrame(_LAST_05Y);
    public static final TimeFrame LAST_10Y = new TimeFrame(_LAST_10Y);
    public static final TimeFrame MAX_AVAILABLE = new TimeFrame(_MAX_AVAILABLE);
    public java.lang.String getValue() { return _value_;}
    public static TimeFrame fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TimeFrame enumeration = (TimeFrame)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TimeFrame fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TimeFrame.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "TimeFrame"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
