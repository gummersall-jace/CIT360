package edu.gummersall.ACP;

public class Handler {
    private Welcome Welcome;
    private Rejection Rejection;
    
    public Handler() {
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
