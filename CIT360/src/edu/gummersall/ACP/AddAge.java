package edu.gummersall.ACP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddAge implements Handler{
    @Override
    public void handleIt() {
    		int age;
        try {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Type your age:");
        age = in.nextInt();
        

        } catch (InputMismatchException e) {
            System.out.println("You need to enter text only number!");
            handleIt();
        }
    }
}
