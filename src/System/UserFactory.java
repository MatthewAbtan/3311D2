package System;

import java.util.*;
import java.util.regex.*;

abstract class User {
    protected String username; //Username here is actually the email involved, we can leave it names "username" or change to "email"
    protected String password;
    protected boolean approved;
    protected int rate;
    
    private static List<String> registeredUsernames = new ArrayList<>();

    public User(String username, String password) {
        this.username = validateUsername(username);
        this.password = validatePassword(password);
    }
    
    private String validateUsername(String username) {
    	//This is actually validation for our email
    	if (username == null || username.isEmpty()) {
    		throw new IllegalArgumentException("Email can not be empty");
    	}
    	if (registeredUsernames.contains(username)) {
    		throw new IllegalArgumentException("Email is already taken");
    	}
    	
    	String usernameConditions = "^[A-Za-z0-9+_.-]+@(.+)$";
    	
    	if (!Pattern.matches(usernameConditions, username)) {
    		throw new IllegalArgumentException("Invalid Email Format");
    	}
    	
    	registeredUsernames.add(username);
    	
    	return username;
    }
    
    private String validatePassword(String password) {
        String passwordConditions = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (!Pattern.matches(passwordConditions, password)) {
            throw new IllegalArgumentException("Password must be at least 8 characters and contain an uppercase, number and symbol.");
        }
        return password;
    }
    
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public int getRate() {
        return rate;
    }
    public boolean isApproved() {
        return approved;
    }
    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
class Student extends User {
    protected boolean approved;
    public Student(String username, String password) {
        super(username, password);
        this.rate = 5; // specific rate for students
    }
}
class FacultyMember extends User {
    public FacultyMember(String username, String password) {
        super(username, password);
        this.rate = 8; // specific rate for faculty members
    }
}
class NonFacultyStaff extends User {
    public NonFacultyStaff(String username, String password) {
        super(username, password);
        this.rate = 10; // specific rate for non-faculty staff
    }
}
class Visitor extends User {
    public Visitor(String username, String password) {
        super(username, password);
        this.approved = true; //only type that is approved by default
        this.rate = 15; // specific rate for visitors
    }
}
public class UserFactory {
    public User createUser(String userType, String username, String password) {
        switch (userType.toLowerCase()) {
            case "student":
                return new Student(username, password);
            case "faculty":
                return new FacultyMember(username, password);
            case "non-faculty":
                return new NonFacultyStaff(username, password);
            case "visitor":
                return new Visitor(username, password);
            default:
                throw new IllegalArgumentException("Invalid user type: " + userType);
        }
    }
}
