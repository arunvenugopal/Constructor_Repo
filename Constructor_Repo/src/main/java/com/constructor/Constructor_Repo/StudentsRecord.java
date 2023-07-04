package com.constructor.Constructor_Repo;

public class StudentsRecord {

	int rollno;
	String name;
	static String cname="Bhavans Vivekananada College";

	public StudentsRecord(int w, String x)
	{
		rollno=w;
		name=x;
	
	}
	public void collegeName()
	{
		System.out.println();
		System.out.println("The Student's Roll Number is: "+rollno);
		System.out.println("The Student's Name is: "+name);	
		System.out.println("The Student's College Name is: "+cname);
	}



	public static void main(String []args)
	{
		StudentsRecord p=new StudentsRecord(101,"Arun V");
		p.collegeName();
		
		StudentsRecord q=new StudentsRecord(102,"Vishnu");
		q.collegeName();
		
		StudentsRecord r=new StudentsRecord(103,"Prabitha");
		r.collegeName();
		
		StudentsRecord s=new StudentsRecord(104,"Sony");
		s.collegeName();
		
		
	}

}
