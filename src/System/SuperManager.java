package System;

import java.util.*;
import java.security.*;

public class SuperManager {
	
	private static volatile SuperManager instance;
	private static final Object lock = new Object(); //Lock object used for synchronization such that we can implement double-checked locking
	
	private Map<String, Manager> managerAccounts = new HashMap<>();
	
	
	//Singleton implementation with double-checked locking, as described in the report.
	public static SuperManager getInstance() {
		if (instance == null) {
			synchronized(lock) {
				if (instance == null) {
					instance = new SuperManager();
				}
			}
		}
		return instance;
	}
	
	public Manager createManagerAccount() {
		String username = generateUniqueUsername();
		String password = generateRandomPassword();
		
		Manager newManager = new Manager(username, password);
		
		return newManager;
	}
	
	private String generateUniqueUsername() {
    	return UUID.randomUUID().toString().replaceAll("[^A-Za-z0-9]", "").substring(0, 8);
    }
	
	private String generateRandomPassword() {
		//Need to satisfy req1, where password is a combination of Uppercase, lowercase, numbers and symbols
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*";
		
		SecureRandom random = new SecureRandom();
		StringBuilder password = new StringBuilder(8);
		
		//Ensure the password meets our minimum requirements
		password.append(upper.charAt(random.nextInt(upper.length())));
		password.append(numbers.charAt(random.nextInt(numbers.length())));
		password.append(symbols.charAt(random.nextInt(symbols.length())));
		
		String allChars = upper + lower + numbers + symbols;
		
		for (int i = password.length(); i < 8; i++) {
			password.append(allChars.charAt(random.nextInt(allChars.length())));
		}
		
		//Shuffle our password to make it fully randomized
		Collections.shuffle(Arrays.asList(password.toString().split("")));
		
		return password.toString();
		
	}
}

class Manager {
	protected String username;
	protected String password;
	
	public Manager(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
}
