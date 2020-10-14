package org.hcl3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(OwnerConfiguration.class);
		Owner o=context.getBean(Owner.class,"o");
		System.out.println("Enter the name,password and mobile number of the user ");
		o.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
