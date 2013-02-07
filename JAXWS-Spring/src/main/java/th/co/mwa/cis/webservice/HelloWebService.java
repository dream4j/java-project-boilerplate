package th.co.mwa.cis.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import th.co.mwa.cis.business.Hello;

@WebService(serviceName="GreetingService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class HelloWebService {

	/* <!-- Inject by Spring --> */
	private Hello hello;

	@WebMethod(exclude=true)
	public void setHello( Hello hello ) {
		this.hello = hello;
	}

	@WebMethod(operationName="sayHello")
	public String sayHello() {
		
		return hello.sayHello();
	}
	
	@WebMethod(operationName="sayGoodBye")
	public String sayGoodBye() {
		
		return hello.sayGoodbye();
	}

	@WebMethod(operationName="helloFullname")
	public String helloFullname( String firstname, String lastname ) {
		
		return hello.helloFullname( firstname, lastname );
	}
}