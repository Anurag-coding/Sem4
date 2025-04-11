package com.iter.q10;
public class MainEnrollApp {
	public static void main(String[] args) {
		Student student1 = new Student("SOHAN",2324161);
	    Student student2 = new Student("ROHAN",5132531);
	    Course course1 = new Course("SANSKRIT",2);
	    Course course2 = new Course("BIOLOGY",6);
	    Enrollment enrollmentSystem = new Enrollment(5);
	    enrollmentSystem.addCourse(course1);
	    enrollmentSystem.addCourse(course2);
	    enrollmentSystem.enrollStudent(student1, course1);
	    enrollmentSystem.enrollStudent(student2, course1);
	    enrollmentSystem.enrollStudent(student1, course2);
	    enrollmentSystem.displayEnrollmentDetails();
	    enrollmentSystem.dropStudent(student1, course1);
	    enrollmentSystem.displayEnrollmentDetails();
    }
}
