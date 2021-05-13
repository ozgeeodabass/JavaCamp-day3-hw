package day3hw;

import java.util.ArrayList;

public class Instructor extends User {
	
	
	
	private String bio;
	private String userId;
	private String firstName;
	private String lastName;
	
	public Instructor(int id, String email, String password) {
		super(id, email, password);
		
	}
	public Instructor(int id, String email, String password, String userId, String firstName, String lastName, String bio) {
		this(id,email,password);
		this.userId=userId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.bio=bio;
		
	}
	
}

