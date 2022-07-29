package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
    System.out.println("studentName is NITHYA");
	}
	public void studentDept()
	{
		System.out.println("studentDept is CSE");
	}

	public void studentId()
	{
		System.out.println("studentId is 17");
	}
	public static void main(String[] args) 
	{
     Student s=new Student();
        s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}

}
