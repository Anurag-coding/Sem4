package com.spring.Maven_project_123;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class studentapp {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 student s1 = (student) context.getBean("student1");
			s1.display();
	}
}
/* output:-
   Name: Anurag kumar
   Rollno: 34
   Emailid: Anuragkr.@gmail.com
*/
   
