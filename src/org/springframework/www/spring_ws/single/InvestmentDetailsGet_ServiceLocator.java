/**
 * InvestmentDetailsGet_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.springframework.www.spring_ws.single;

public class InvestmentDetailsGet_ServiceLocator extends org.apache.axis.client.Service implements org.springframework.www.spring_ws.single.InvestmentDetailsGet_Service {

    public InvestmentDetailsGet_ServiceLocator() {
    }


    public InvestmentDetailsGet_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InvestmentDetailsGet_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InvestmentDetailsGetSoap11
    private java.lang.String InvestmentDetailsGetSoap11_address = "https://test.api.privemanagers.com.cn/wsdl/";

    public java.lang.String getInvestmentDetailsGetSoap11Address() {
        return InvestmentDetailsGetSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InvestmentDetailsGetSoap11WSDDServiceName = "InvestmentDetailsGetSoap11";

    public java.lang.String getInvestmentDetailsGetSoap11WSDDServiceName() {
        return InvestmentDetailsGetSoap11WSDDServiceName;
    }

    public void setInvestmentDetailsGetSoap11WSDDServiceName(java.lang.String name) {
        InvestmentDetailsGetSoap11WSDDServiceName = name;
    }

    public org.springframework.www.spring_ws.single.InvestmentDetailsGet_PortType getInvestmentDetailsGetSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InvestmentDetailsGetSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInvestmentDetailsGetSoap11(endpoint);
    }

    public org.springframework.www.spring_ws.single.InvestmentDetailsGet_PortType getInvestmentDetailsGetSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.springframework.www.spring_ws.single.InvestmentDetailsGetSoap11Stub _stub = new org.springframework.www.spring_ws.single.InvestmentDetailsGetSoap11Stub(portAddress, this);
            _stub.setPortName(getInvestmentDetailsGetSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInvestmentDetailsGetSoap11EndpointAddress(java.lang.String address) {
        InvestmentDetailsGetSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.springframework.www.spring_ws.single.InvestmentDetailsGet_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.springframework.www.spring_ws.single.InvestmentDetailsGetSoap11Stub _stub = new org.springframework.www.spring_ws.single.InvestmentDetailsGetSoap11Stub(new java.net.URL(InvestmentDetailsGetSoap11_address), this);
                _stub.setPortName(getInvestmentDetailsGetSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("InvestmentDetailsGetSoap11".equals(inputPortName)) {
            return getInvestmentDetailsGetSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.springframework.org/spring-ws/single", "InvestmentDetailsGet");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.springframework.org/spring-ws/single", "InvestmentDetailsGetSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InvestmentDetailsGetSoap11".equals(portName)) {
            setInvestmentDetailsGetSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
