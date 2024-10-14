package com.run;
import com.dev.Greeting;
import com.dev.Welcome;
import com.dev.DevLead;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting grt=new Greeting();
		grt.greet();
		
		Welcome wel=new Welcome();
		wel.hello();
		
		DevLead dl=new DevLead();
		dl.devlead();
	}
}
