package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;                                            //CTRL+Shift+O
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.connection.StudentConnection;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentDao {
	
	Connection connection=StudentConnection.getStudentConnection();
	/*
	 * Insert method for student
	 */
	public Student insertStudent(Student student) {
		
		String insertQuery = "insert into student values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2,student.getStudentname());
			preparedStatement.setString(3,student.getStudentEmail());
			preparedStatement.setLong(4, student.getStudentPhone());
			
			preparedStatement.execute();
			return student;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	} /*method insert ended*/
	
	/*
	 * update student data methods
	 */
	public int updateStudentName(int studentId, String studentName){
	{
		String updateStudentNameQuery = "update student set name=? where id=?";
		
		try {
		PreparedStatement preparedstatement = connection.prepareStatement(updateStudentNameQuery);
		
		preparedstatement.setInt(2,studentId);
		preparedstatement.setString(1,studentName);
		return preparedstatement.executeUpdate();
	} catch(SQLException e) {
		//TIDI Auto-generated catch block
		e.printStackTrace();
			}
		
		return 0;
	}
	}
	/*
	 * update student data method
	 */
	
	public void displayStudentDetails()
	{
		String displayStudentQuery = "SELECT * FROM student";
		try {
		PreparedStatement preparedStatement=connection.prepareStatement(displayStudentQuery);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		while (resultSet.next()){
	
		
		int id=resultSet.getInt("id");
		String name = resultSet.getString("name");
		String email = resultSet.getString("email");
		long phone=resultSet.getLong("phone");
		
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("email = "+email);
		System.out.println("phone = "+phone);
		
		} catch (SQLException e){
			e.printStackTrace();
		}
}
public int deleteStudentByid(int studentId) {
	return 0;
}
	}
