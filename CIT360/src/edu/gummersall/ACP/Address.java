package edu.gummersall.ACP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Address implements Handler{
    @Override
    public void handleIt() {
    		String address;
        try {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Type your address:");
        address = in.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("You need to enter text only number!");
            handleIt();
        }
    }
}
