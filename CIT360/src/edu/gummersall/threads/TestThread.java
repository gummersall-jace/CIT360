package edu.gummersall.threads;

public class TestThread {    
	public static void main(String[] args){
		
		// Create a new Thread that executes the code in GetTime20
		
		Thread getTime = new GetTime();
		
		// Create a new Thread created using the Runnable interface
		// Execute the code in run after 10 seconds
		
		Runnable checkGrades = new CheckGrades(10);
		
		Runnable checkGradesAgain = new CheckGrades(20);
		
		// Call for the code in the method run to execute
		
		getTime.start();
		
		new Thread(checkGrades).start();
		new Thread(checkGradesAgain).start();
		
	}
}
