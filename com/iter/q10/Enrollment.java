package com.iter.q10;
public class Enrollment implements Enrollmentsystem {
    private Course[] courses;
    private int courseCount;
    public Enrollment(int maxCourses) {
        courses = new Course[maxCourses];
        courseCount = 0;
    }
    public void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        }
    }
    @Override
    public void enrollStudent(Student student, Course course) {
        course.addStudent(student);
        System.out.println(student.getName() + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        course.removeStudent(student);
        System.out.println(student.getName() + " dropped from " + course.getCourseName());
    }

    @Override
    public void displayEnrollmentDetails() {
        for (int i = 0; i < courseCount; i++) {
            Course course = courses[i];
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getEnrolledStudents()) {
                if (student != null) {
                    System.out.println("- " + student.getName() + " (" + student.getregistation() + ")");
                }
            }
        }
    }
}