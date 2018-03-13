package edu.gummersall.threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunAllThree {

	private long myNumber;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable countTime = new AllThree();
		countTime.run();

	}

	public long getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(long myNumber) {
		this.myNumber = myNumber;
	}
	
	

}
