/**
 * TimeFrameStatistic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sly.www.main.server.webservice.bindings;

public class TimeFrameStatistic  implements java.io.Serializable {
    /* The timeframe for which the value is
     * 						calculated. */
    private org.sly.www.main.server.webservice.bindings.TimeFrame timeFrame;

    private java.math.BigDecimal value;

    public TimeFrameStatistic() {
    }

    public TimeFrameStatistic(
           org.sly.www.main.server.webservice.bindings.TimeFrame timeFrame,
           java.math.BigDecimal value) {
           this.timeFrame = timeFrame;
           this.value = value;
    }


    /**
     * Gets the timeFrame value for this TimeFrameStatistic.
     * 
     * @return timeFrame   * The timeframe for which the value is
     * 						calculated.
     */
    public org.sly.www.main.server.webservice.bindings.TimeFrame getTimeFrame() {
        return timeFrame;
    }


    /**
     * Sets the timeFrame value for this TimeFrameStatistic.
     * 
     * @param timeFrame   * The timeframe for which the value is
     * 						calculated.
     */
    public void setTimeFrame(org.sly.www.main.server.webservice.bindings.TimeFrame timeFrame) {
        this.timeFrame = timeFrame;
    }


    /**
     * Gets the value value for this TimeFrameStatistic.
     * 
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }


    /**
     * Sets the value value for this TimeFrameStatistic.
     * 
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeFrameStatistic)) return false;
        TimeFrameStatistic other = (TimeFrameStatistic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeFrame==null && other.getTimeFrame()==null) || 
             (this.timeFrame!=null &&
              this.timeFrame.equals(other.getTimeFrame()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTimeFrame() != null) {
            _hashCode += getTimeFrame().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeFrameStatistic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "TimeFrameStatistic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "TimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "TimeFrame"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
