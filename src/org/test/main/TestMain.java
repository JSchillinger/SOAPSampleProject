package org.test.main;

import org.apache.axis.message.SOAPHeaderElement;
import org.sly.main.server.utils.InstallCert;
import org.sly.www.main.server.webservice.bindings.InvestmentDetailsGetRequest;
import org.sly.www.main.server.webservice.bindings.InvestmentDetailsGetResponse;
import org.springframework.www.spring_ws.single.InvestmentDetailsGetSoap11Stub;
import org.springframework.www.spring_ws.single.InvestmentDetailsGet_ServiceLocator;

public class TestMain {

	public static void main(String[] args) {

		try {

			/**
			 * Currently Prive hasn't not installed the SSL certificate on
			 * domain test.api.privemanagers.com.cn, so you need to accept and
			 * install certificate manually.
			 * 
			 * This will not be needed once we switch to
			 * api.privemanagers.com.cn and enable the SSL certificate.
			 */
			InstallCert.install("test.api.privemanagers.com.cn", 443);

			/*
			 * SOAP request body
			 */
			InvestmentDetailsGet_ServiceLocator locator = new InvestmentDetailsGet_ServiceLocator();
			InvestmentDetailsGetSoap11Stub stub = (InvestmentDetailsGetSoap11Stub) locator
					.getInvestmentDetailsGetSoap11();

			// Request
			InvestmentDetailsGetRequest request = new InvestmentDetailsGetRequest();
			request.setIsin("LU0095030648");
			request.setCurrency("USD");
			request.setCallerSystemID("PINJIN");

			String username = "******";
			String password = "******";

			SOAPHeaderElement header = new SOAPHeaderElement(
					"http://www.sly.org/main/server/webservice/bindings",
					"Header");
			header.setAttribute("username", username);
			header.setAttribute("password", password);

			stub.setHeader(header);

			InvestmentDetailsGetResponse response = stub
					.investmentDetailsGet(request);

			// Response (output)
			System.out.println("Investment Name: " + response.getName());
			System.out.println("Investment Sector: " + response.getSector());
			System.out.println("Investment Last Value: "
					+ response.getLastValue());
			System.out.println("Investment Last Value Date: "
					+ response.getLastValueDate());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
