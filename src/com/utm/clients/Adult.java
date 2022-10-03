package com.utm.clients;

public class Adult extends Client{

    @Override
    public void buyTicket() {
            System.out.println("Adult buys a ticket.");
    }

    @Override
    public void enterZoo() {
        System.out.println("Adult enters the zoo.");
    }
}
