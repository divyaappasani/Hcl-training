package org.hcl3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerConfiguration {
	@Bean(name="o")
	public Owner setDetails(){
		Owner o=new Owner();
		o.setName("Adhithya");
		o.setPassword("adhikg1234");
		o.setMobileNumber("9789097806");
		return o;
	}

}
