package com.spring.Mavenspringdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mobileApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		sim sim1=(sim) context.getBean("air");
		sim sim2=(sim) context.getBean("voda");
		sim1.call();
		sim1.data();
		System.out.println(" ");
		sim2.call();
		sim2.data();
	}
}
/* output:-
   Calling from vodafone
   Data available:200mb!!
 
   Calling from airtel
   Data available:100mb!!
*/
