package com.demo.mvc2;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents() {
	//	System.out.println("Check1");
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Sharif","Jamil","shaz.jamil@gmail.com"));
		students.add(new Student("Kayenaat","Jamil","Kayenaat.jamil@gmail.com"));
		students.add(new Student("Nuzhat","Jamil","nuzhat.jamil@gmail.com"));
		return students;
		
	}
}
