package demo.spring.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
    @WebMethod(operationName = "sayHi", action = "urn:SayHi")
	String sayHi(String text);
}