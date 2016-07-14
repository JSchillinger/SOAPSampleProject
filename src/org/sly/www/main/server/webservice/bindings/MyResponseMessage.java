/**
 * MyResponseMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sly.www.main.server.webservice.bindings;


/**
 * The base response message class.
 */
public abstract class MyResponseMessage  extends org.sly.www.main.server.webservice.bindings.MyResponse  implements java.io.Serializable {
    /* The update key as passed to Prive above. */
    private java.lang.String entityKey;

    public MyResponseMessage() {
    }

    public MyResponseMessage(
           boolean success,
           java.lang.String errorMessage,
           java.lang.String entityKey) {
        super(
            success,
            errorMessage);
        this.entityKey = entityKey;
    }


    /**
     * Gets the entityKey value for this MyResponseMessage.
     * 
     * @return entityKey   * The update key as passed to Prive above.
     */
    public java.lang.String getEntityKey() {
        return entityKey;
    }


    /**
     * Sets the entityKey value for this MyResponseMessage.
     * 
     * @param entityKey   * The update key as passed to Prive above.
     */
    public void setEntityKey(java.lang.String entityKey) {
        this.entityKey = entityKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyResponseMessage)) return false;
        MyResponseMessage other = (MyResponseMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityKey==null && other.getEntityKey()==null) || 
             (this.entityKey!=null &&
              this.entityKey.equals(other.getEntityKey())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEntityKey() != null) {
            _hashCode += getEntityKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyResponseMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "MyResponseMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "EntityKey"));
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
