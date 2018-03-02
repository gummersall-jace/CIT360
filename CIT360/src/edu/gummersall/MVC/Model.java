package edu.gummersall.MVC;

public class Model {

	    // Attributes
	    private String name;
	    private String address;

	    // Constructor
	    public Model() {
	        this.yourName();
	        this.yourAddress();
	    }

	    // Getters
	    public String getName() {
	        return this.name;
	    }
	    
	    public String getAddress() {
	        return this.address;
	    }

	    //Setters
		public void setAddress(String address) {
			this.address = address;
		}

		public String yourAddress() {
	        return this.address;
	    }
	    
	    // Methods
	    public String yourName() {
	        return this.name;
	    }
	    
	    public void setName(String name) {
			this.name = name;
		}
}
