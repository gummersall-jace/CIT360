package edu.gummersall.MVC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    // Reference to the view and the model
    private Model model;
    private View view;

    // Constructor
    public Controller (Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Method run
    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
        		view.printName();
            model.setName(reader.readLine());    
            view.printAddress();
            model.setAddress(reader.readLine());
            view.printAll(model.getName(), model.getAddress());
        }
    }
}
