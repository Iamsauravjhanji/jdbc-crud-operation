package com.jsp.student_crud_with_prepared.service;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentService
{
	StudentDao studentDao = new StudentDao();
	/*
	 * 
	 * insert method for student
	 */
	public Student insertStudentService(Student student)
	{
		System.out.println("insert Service method started!!!!!");
		
		if(student.getStudentId()<9999) {
			Student student2=studentDao.insertStudent(student);
			System.out.println("insertService method ended!!!!");
            return student2;
		}else {
			System.err.println("please pass your id with 4 digits or less than it");
		}
		return null;
	}
	/*
	 * update student data methods
	 */
	public int updateStudentNameService(int studentid,String studentName) {
		return studentDao.updateStudentName(studentid, studentName);
	}
	/*
	 *this all data method which display all the data of students
	 */
      public void displayStudentDetails()
      {
    	  studentDao.displayStudentDetails();
      }
}
   