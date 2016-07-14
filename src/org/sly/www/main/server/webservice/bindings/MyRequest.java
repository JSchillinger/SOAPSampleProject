/**
 * MyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sly.www.main.server.webservice.bindings;


/**
 * The base request class.
 */
public abstract class MyRequest  implements java.io.Serializable {
    /* Field so that Prive system knows what
     * 						counterparty is calling. */
    private java.lang.String callerSystemID;

    public MyRequest() {
    }

    public MyRequest(
           java.lang.String callerSystemID) {
           this.callerSystemID = callerSystemID;
    }


    /**
     * Gets the callerSystemID value for this MyRequest.
     * 
     * @return callerSystemID   * Field so that Prive system knows what
     * 						counterparty is calling.
     */
    public java.lang.String getCallerSystemID() {
        return callerSystemID;
    }


    /**
     * Sets the callerSystemID value for this MyRequest.
     * 
     * @param callerSystemID   * Field so that Prive system knows what
     * 						counterparty is calling.
     */
    public void setCallerSystemID(java.lang.String callerSystemID) {
        this.callerSystemID = callerSystemID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyRequest)) return false;
        MyRequest other = (MyRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callerSystemID==null && other.getCallerSystemID()==null) || 
             (this.callerSystemID!=null &&
              this.callerSystemID.equals(other.getCallerSystemID())));
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
        if (getCallerSystemID() != null) {
            _hashCode += getCallerSystemID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "MyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callerSystemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "CallerSystemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
