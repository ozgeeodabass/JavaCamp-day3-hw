package day3hw;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Student student= new Student(1,"ozge@gmail.com", "ozge123","�zge","odaba�","2", "22");
	
		
		
		
		Instructor instructor = new Instructor(1,"engin@gmail.com","engin123","1","Engin","Demiro�","Yaz�l�m Geli�tirici");
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerACourse("C#");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.startACourse("Python", "2022");
		
		
		
		

	}

}
