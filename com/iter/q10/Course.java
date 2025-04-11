package com.iter.q10;
public class Course {
	 private String courseName;
	 private Student[] enrolledStudents;
	 private int studentCount;
	   public Course( String courseName, int capacity) {
	        this.courseName = courseName;
	        this.enrolledStudents = new Student[capacity];
	        this.studentCount = 0;
	    }
	   public String getCourseName() {
	        return courseName;
	    }
	   public Student[] getEnrolledStudents() {
	        return enrolledStudents;
	    }
	   public void addStudent(Student student) {
	        if (studentCount < enrolledStudents.length) {
	            enrolledStudents[studentCount++] = student;
	        } else {
	            System.out.println("Course capacity full for " + courseName);
	        }
	    }
	   public void removeStudent(Student student) {
	        for (int i = 0; i < studentCount; i++) {
	            if (enrolledStudents[i].getregistation()== student.getregistation()) {
	                for (int j = i; j < studentCount - 1; j++) {
	                    enrolledStudents[j] = enrolledStudents[j + 1];
	                }
	                enrolledStudents[--studentCount] = null;
	                break;
	            }
	         }
	        }
	    }

