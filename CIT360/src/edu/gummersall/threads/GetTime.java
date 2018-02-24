package edu.gummersall.threads;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.text.DateFormat;

public class GetTime extends Thread {
	public void run(){
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		});
		
		// Creating fields that will contain date info
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		// Output the current date and time 20 times
		for(int i = 1; i <= 20; i++){
		
			// A Date object contains date and time data
			rightNow = new Date();
			
			// Locale defines time formats depending on location
			currentLocale = new Locale("en", "US");
			
			// DateFormat allows you to define dates / times using predefined
			// styles DEFAULT, SHORT, MEDIUM, LONG, or FULL
			// getTimeInstance only outputs time information
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			
			// getDateInstance only outputs time information
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
			
			// Convert the time and date into Strings
			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
		
			// You must wrap the sleep method in error handling
			// code to catch the InterruptedException exception
			// sleep pauses thread execution for 2 seconds below
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
		}
		
	}
}
