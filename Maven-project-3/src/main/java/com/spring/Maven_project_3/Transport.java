package com.spring.Maven_project_3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Transport {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        vehicle car = (vehicle) context.getBean("car");
        vehicle bike = (vehicle) context.getBean("bike");
        car.start();
        car.stop();
        System.out.println();
        bike.start();
        bike.stop();
    }
}
/*output:-
  Car Thar (ID: t354) is starting.
  Car Thar (ID: t354) is stopping.

  Bike Splendor (ID: Bh6) is starting.
  Bike Splendor (ID: Bh6) is stopping.
*/

