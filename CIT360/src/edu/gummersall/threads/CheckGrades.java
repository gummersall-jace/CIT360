package edu.gummersall.threads;

public class CheckGrades implements Runnable {

		private int startTime;
		
		public CheckGrades(int startTime){
			this.startTime = startTime;
		}
		
		public void run(){
			
			try
			{
				Thread.sleep(startTime * 1000);
			}
			
			catch(InterruptedException e)
			{}
			System.out.println("Checking Grades");
		}
		
}
