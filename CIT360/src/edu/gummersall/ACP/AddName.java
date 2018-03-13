package edu.gummersall.ACP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddName implements Handler{
    @Override
    public void handleIt() {
    		String name;
        try {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Print your name:");
        name = in.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("You need to enter text only number!");
            handleIt();
        }
    }
}
