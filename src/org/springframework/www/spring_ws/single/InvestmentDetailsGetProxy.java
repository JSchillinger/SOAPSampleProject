package org.springframework.www.spring_ws.single;

public class InvestmentDetailsGetProxy implements org.springframework.www.spring_ws.single.InvestmentDetailsGet_PortType {
  private String _endpoint = null;
  private org.springframework.www.spring_ws.single.InvestmentDetailsGet_PortType investmentDetailsGet_PortType = null;
  
  public InvestmentDetailsGetProxy() {
    _initInvestmentDetailsGetProxy();
  }
  
  public InvestmentDetailsGetProxy(String endpoint) {
    _endpoint = endpoint;
    _initInvestmentDetailsGetProxy();
  }
  
  private void _initInvestmentDetailsGetProxy() {
    try {
      investmentDetailsGet_PortType = (new org.springframework.www.spring_ws.single.InvestmentDetailsGet_ServiceLocator()).getInvestmentDetailsGetSoap11();
      if (investmentDetailsGet_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)investmentDetailsGet_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)investmentDetailsGet_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (investmentDetailsGet_PortType != null)
      ((javax.xml.rpc.Stub)investmentDetailsGet_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.springframework.www.spring_ws.single.InvestmentDetailsGet_PortType getInvestmentDetailsGet_PortType() {
    if (investmentDetailsGet_PortType == null)
      _initInvestmentDetailsGetProxy();
    return investmentDetailsGet_PortType;
  }
  
  public org.sly.www.main.server.webservice.bindings.InvestmentDetailsGetResponse investmentDetailsGet(org.sly.www.main.server.webservice.bindings.InvestmentDetailsGetRequest investmentDetailsGetRequest) throws java.rmi.RemoteException{
    if (investmentDetailsGet_PortType == null)
      _initInvestmentDetailsGetProxy();
    return investmentDetailsGet_PortType.investmentDetailsGet(investmentDetailsGetRequest);
  }
  
  
}