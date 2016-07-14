/**
 * InvestmentDetailsGetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sly.www.main.server.webservice.bindings;

public class InvestmentDetailsGetRequest  extends org.sly.www.main.server.webservice.bindings.MyRequest  implements java.io.Serializable {
    /* The Prive key of the investment (Strategy) (Either PriveInvestmentKey
     * or [ISIN & Currency] is required) */
    private java.lang.String priveInvestmentKey;

    /* Isin of the investment (Isin & Currency is combined as unique
     * identifier)  (Either PriveInvestmentKey or [ISIN & Currency] is required) */
    private java.lang.String isin;

    /* Currency of the investment (Isin & Currency is combined as
     * unique identifier)  (Either PriveInvestmentKey or [ISIN & Currency]
     * is required) */
    private java.lang.String currency;

    /* Preferred data source key for statistics (Optional) */
    private java.lang.String datasourceDefinitionKey;

    /* Access Token for anonymous access (Optional) */
    private java.lang.String accessToken;

    public InvestmentDetailsGetRequest() {
    }

    public InvestmentDetailsGetRequest(
           java.lang.String callerSystemID,
           java.lang.String priveInvestmentKey,
           java.lang.String isin,
           java.lang.String currency,
           java.lang.String datasourceDefinitionKey,
           java.lang.String accessToken) {
        super(
            callerSystemID);
        this.priveInvestmentKey = priveInvestmentKey;
        this.isin = isin;
        this.currency = currency;
        this.datasourceDefinitionKey = datasourceDefinitionKey;
        this.accessToken = accessToken;
    }


    /**
     * Gets the priveInvestmentKey value for this InvestmentDetailsGetRequest.
     * 
     * @return priveInvestmentKey   * The Prive key of the investment (Strategy) (Either PriveInvestmentKey
     * or [ISIN & Currency] is required)
     */
    public java.lang.String getPriveInvestmentKey() {
        return priveInvestmentKey;
    }


    /**
     * Sets the priveInvestmentKey value for this InvestmentDetailsGetRequest.
     * 
     * @param priveInvestmentKey   * The Prive key of the investment (Strategy) (Either PriveInvestmentKey
     * or [ISIN & Currency] is required)
     */
    public void setPriveInvestmentKey(java.lang.String priveInvestmentKey) {
        this.priveInvestmentKey = priveInvestmentKey;
    }


    /**
     * Gets the isin value for this InvestmentDetailsGetRequest.
     * 
     * @return isin   * Isin of the investment (Isin & Currency is combined as unique
     * identifier)  (Either PriveInvestmentKey or [ISIN & Currency] is required)
     */
    public java.lang.String getIsin() {
        return isin;
    }


    /**
     * Sets the isin value for this InvestmentDetailsGetRequest.
     * 
     * @param isin   * Isin of the investment (Isin & Currency is combined as unique
     * identifier)  (Either PriveInvestmentKey or [ISIN & Currency] is required)
     */
    public void setIsin(java.lang.String isin) {
        this.isin = isin;
    }


    /**
     * Gets the currency value for this InvestmentDetailsGetRequest.
     * 
     * @return currency   * Currency of the investment (Isin & Currency is combined as
     * unique identifier)  (Either PriveInvestmentKey or [ISIN & Currency]
     * is required)
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InvestmentDetailsGetRequest.
     * 
     * @param currency   * Currency of the investment (Isin & Currency is combined as
     * unique identifier)  (Either PriveInvestmentKey or [ISIN & Currency]
     * is required)
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the datasourceDefinitionKey value for this InvestmentDetailsGetRequest.
     * 
     * @return datasourceDefinitionKey   * Preferred data source key for statistics (Optional)
     */
    public java.lang.String getDatasourceDefinitionKey() {
        return datasourceDefinitionKey;
    }


    /**
     * Sets the datasourceDefinitionKey value for this InvestmentDetailsGetRequest.
     * 
     * @param datasourceDefinitionKey   * Preferred data source key for statistics (Optional)
     */
    public void setDatasourceDefinitionKey(java.lang.String datasourceDefinitionKey) {
        this.datasourceDefinitionKey = datasourceDefinitionKey;
    }


    /**
     * Gets the accessToken value for this InvestmentDetailsGetRequest.
     * 
     * @return accessToken   * Access Token for anonymous access (Optional)
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this InvestmentDetailsGetRequest.
     * 
     * @param accessToken   * Access Token for anonymous access (Optional)
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvestmentDetailsGetRequest)) return false;
        InvestmentDetailsGetRequest other = (InvestmentDetailsGetRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.priveInvestmentKey==null && other.getPriveInvestmentKey()==null) || 
             (this.priveInvestmentKey!=null &&
              this.priveInvestmentKey.equals(other.getPriveInvestmentKey()))) &&
            ((this.isin==null && other.getIsin()==null) || 
             (this.isin!=null &&
              this.isin.equals(other.getIsin()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.datasourceDefinitionKey==null && other.getDatasourceDefinitionKey()==null) || 
             (this.datasourceDefinitionKey!=null &&
              this.datasourceDefinitionKey.equals(other.getDatasourceDefinitionKey()))) &&
            ((this.accessToken==null && other.getAccessToken()==null) || 
             (this.accessToken!=null &&
              this.accessToken.equals(other.getAccessToken())));
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
        if (getPriveInvestmentKey() != null) {
            _hashCode += getPriveInvestmentKey().hashCode();
        }
        if (getIsin() != null) {
            _hashCode += getIsin().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDatasourceDefinitionKey() != null) {
            _hashCode += getDatasourceDefinitionKey().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvestmentDetailsGetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", ">InvestmentDetailsGetRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priveInvestmentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "PriveInvestmentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "Isin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datasourceDefinitionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "DatasourceDefinitionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "AccessToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
