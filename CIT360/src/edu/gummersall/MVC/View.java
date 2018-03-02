package edu.gummersall.MVC;

public class View{
    // Constructor
    public View(Model model) {
    		
    }

    // Method printName
    public void printName() {
        System.out.print("Please enter your name: ");
    }

    // Method printAddress
    public void printAddress() {
        System.out.print("Please Enter your address: ");
    }

    // Method printAll
    public void printAll(String name, String address) {
        System.out.println("\nThis is your name and address: \n" + name + "\n" + address);
        java.lang.System.exit(0);
    }
}
