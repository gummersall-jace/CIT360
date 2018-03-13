package edu.gummersall.ACP;

import java.util.Scanner;

public class ACP {
	private String name;
	private Integer age;
	private String address;
	
	 public static void main(String[] args) {
	        
	        AppController app = new AppController();        
	        
	        app.mapCommand("Name", new AddName());
	        app.mapCommand("Age", new AddAge());
	        app.mapCommand("Address", new Address());
	        app.mapCommand("ProfileSetUp", new ProfileSetUp());
	        app.mapCommand("Exit", new Exit());
	        
	        startApp(app);
	    }

		private static void startApp(AppController app) {
		    app.handleRequest("ProfileSetUp");
		    
	        Scanner in = new Scanner(System.in);
	        String request = in.nextLine();
	        if (app.handlerMap.containsKey(request)==true) {
	            app.handleRequest(request);
	        } else {
	            app.handleRequest("Tryagain");
	        }
	        
	        startApp(app);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		
}
