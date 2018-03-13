package edu.gummersall.ACP;

public class Exit implements Handler {
	@Override
	public void handleIt() {
	    System.out.println("\nSee ya later!");
	    System.exit(0);
	}
}
