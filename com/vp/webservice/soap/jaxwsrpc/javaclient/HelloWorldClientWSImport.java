package com.vp.webservice.soap.jaxwsrpc.javaclient;

import com.vp.webservice.soap.jaxwsrpc.HelloWorldImplService;
import com.vp.webservice.soap.jaxwsrpc.IHelloWorld;

public class HelloWorldClientWSImport {
	public static void main(String[] args) {

		HelloWorldImplService helloService = new HelloWorldImplService();
		IHelloWorld hello = helloService.getHelloWorldImplPort();
		System.out.println(hello.sayHello("VP Rajesh"));

    }
}
