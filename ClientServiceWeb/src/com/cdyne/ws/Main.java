package com.cdyne.ws;

import java.rmi.RemoteException;
import java.util.ServiceConfigurationError;

import javax.security.sasl.SaslException;

public class Main {

	public static void main(String[] args) {
		IP2GeoLocator Locator = new IP2GeoLocator();

	
			IP2GeoSoap12Stub stub = (IP2GeoSoap12Stub) Locator.getIP2GeoSoap12();
			IPInformation info = stub.resolveIP("216.58.210.288", "0");
			System.out.println(info.getCountry());
		

	}

}
