package edu.gummersall.ACP;

public class HandlerExample {
    private Welcome Welcome;
    private Rejection Rejection;
    
    public HandlerExample() {
    		Welcome = new Welcome();
    		Rejection = new Rejection();
    }
    
    public void handle(boolean verified) {
    		if (verified){
    			Welcome.message();
    		}
    		else {
    			Rejection.message();
    		}
    }
}
