package com.Anurag;

class College {
    String collegeName;
    String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }
}
class CollegeMember {
    long memberId;
    String memberName;

    public CollegeMember(long memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public void displayMemberInfo() {
        System.out.println("College Member [ID=" + memberId + ", Name=" + memberName + "]");
    }
}
class Student extends CollegeMember {
    College college; 

    public Student(long studentId, String studentName, College college) {
        super(studentId, studentName);
        this.college = college;
    }
    public void displayMemberInfo() {
        System.out.println("Student [ID=" + memberId + ", Name=" + memberName + ", College Name=" + college.collegeName + ", College Location=" + college.collegeLoc + "]");
    }
}

public class mainApp {
    public static void main(String[] args) {
        College college = new College("Iter Soa", "Jagamora Khandagiri");
        Student s1 = new Student(2341011, "Anurag", college);
        s1.displayMemberInfo();
    }
}






