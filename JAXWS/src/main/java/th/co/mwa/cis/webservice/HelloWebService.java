package th.co.mwa.cis.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(serviceName="GreetingService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class HelloWebService {
 
	@WebMethod(operationName="sayHello")
	public String sayHello( String name ) {
		return "Hello, JAX-WS and " + name;
	}
 
}