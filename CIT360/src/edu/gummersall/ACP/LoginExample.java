package edu.gummersall.ACP;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("(For example must be user)");
		System.out.println("Username: ");
		String user = input.next();
		System.out.println("(For example can be anything)");
		System.out.println("Password: ");
		String password = input.next();
		
		ApplicationControllerPattern apc = new ApplicationControllerPattern();
		apc.handleLogin(user, password);

	}

}
