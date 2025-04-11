package com.iter.q10;
public class Student {
	private String name;
    private int registationnumber;
    public Student(String name, int registationnumber) {
        this.name = name;
        this.registationnumber = registationnumber;
    }
    public String getName() {
        return name;
    }
    public int getregistation() {
        return registationnumber;
    }
    @Override
    public String toString() {
        return "Student Name: " + name + ", Student registation number: " + registationnumber;
    }
}
