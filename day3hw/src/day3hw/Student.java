package day3hw;

import java.util.ArrayList;

public class Student extends User {
	
	
	private String firstName;
	private String lastName;
	private String userId;
	private String age;
	
	
	public Student(int id, String email, String password) {
		super(id, email, password);
		
	}


	public Student(int id, String email, String password, String firstName, String lastName, String userId,
			String age) {
		this(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.age = age;
	}
	
	

}
