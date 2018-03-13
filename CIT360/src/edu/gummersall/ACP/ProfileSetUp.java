package edu.gummersall.ACP;

public class ProfileSetUp implements Handler{

    @Override
    public void handleIt() {
       System.out.println("Let's Set Up your profile");
       System.out.println("Pick from the choices below:");
       System.out.println("----------------------------");
       System.out.println("Name");
       System.out.println("Age");
       System.out.println("Address");
       System.out.println("Exit");
    }
    
}