package edu.gummersall.threads;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;



public class AllThree implements Runnable {

	RunAllThree getNumber = new RunAllThree();
	Thread getTime = new GetTime();
	
	public void run(){
		Scanner reader = new Scanner(System.in); 
		System.out.println("When do you want to start wseeing the time?");
		long number = reader.nextInt();
		reader.close();
		getNumber.setMyNumber(number);
		
		
		for(int i = 0; i <= 10; i++) {
			try
			{
				
				if (i==getNumber.getMyNumber()) {
					ExecutorService executor = Executors.newSingleThreadExecutor();
					executor.submit(() -> {
						getTime.start();
					});	
				}

				System.out.println(i);
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e)
			{}
		}
	}

}
