package edu.gummersall.ACP;

public class ApplicationControllerPattern {
	private Handler handler = new Handler();
	
	private boolean isAuthenticUser(String username, String password) {
		System.out.println(username);
		if (username.equals("user")) {
			System.out.println("The User was authenticated");
			return true;
		}
		else {
			System.out.println("User not authenticated");
			return false;
		}
			
		
	}
	
	private void trackRequest(String username) {
		System.out.println("Checking: " + username + " credentials");
	}
	
	public void handleLogin(String username, String password) {
		
		trackRequest(username);
		boolean verified = isAuthenticUser(username, password);
		handler.handle(verified);

	}
}
