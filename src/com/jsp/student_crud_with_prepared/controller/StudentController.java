package com.jsp.student_crud_with_prepared.controller;

import java.util.Scanner;

import com.jsp.student_crud_with_prepared.dto.Student;
import com.jsp.student_crud_with_prepared.service.StudentService;

public class StudentController
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("main method started!!!!");
		Student student=null;
		StudentService studentservice = new StudentService();
	
		System.out.println("main method ended!!!");
		System.out.println("1.Insert\n2.Update");
		System.out.println("Main method started");
		int ch = sc.nextInt();
		switch(ch) {
		/*
		 * Case 1 for insertion data
		 */
		case 1: {
			System.out.println("Enter student id");
			int id=sc.nextInt();
			System.out.println("Enter student name");
			String name=sc.next();
			System.out.println("Enter student email");
			String email=sc.next();
			System.out.println("Enter student phone");
			long phone=sc.nextLong();
			
			student  = new Student(id,name,email,phone);
			studentservice.insertStudentService(student);
		}
		break;
		/*
		 * Case 2 for update data
		 */
		case 2:{
			System.out.println("Enter student id");
			int id=sc.nextInt();
			System.out.println("Enter student name");
			String name = sc.next();
			
			int id1=studentservice.updateStudentNameService(id,name);
			if(id1==1)
			{
				System.out.println("Data updated");
			}
			else
			{
				System.out.println("id not found please check once");
			}
			
		}
		break;
		}
		
		System.out.println("main method ended!!!!");
		
	}

}
