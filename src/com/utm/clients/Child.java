package com.utm.clients;

public class Child extends Client{

    @Override
    public void buyTicket() {
            System.out.println("Child buys a ticket with 50% discount.");
    }

    @Override
     public void enterZoo() {
            System.out.println("Child enters the zoo.");
    }
}
