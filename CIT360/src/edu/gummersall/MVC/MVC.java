package edu.gummersall.MVC;

import java.io.IOException;

public class MVC {
    public static void main(String[] args) throws IOException {
        // Model
        Model model = new Model();
        // View
        View view = new View(model);
        // Pass to Controller
        new Controller(model, view).run();
	}
}