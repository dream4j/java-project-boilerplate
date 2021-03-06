package th.co.mwa.cis.business.service.impl;

import th.co.mwa.cis.business.service.Hello;

public class HelloImpl implements Hello {

	@Override
	public String sayHello(){
		
		return "Hello, JAX-WS + Spring Integration!";
	}

	@Override
	public String sayGoodbye() {
		
		return "Goodbye, JAX-WS + Spring Integration!";
	}

	@Override
	public String helloFullname( String firstname, String lastname ) {
		
		return "Hello, " + firstname + " " + lastname;
	}
	
}