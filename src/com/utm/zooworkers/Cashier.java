package com.utm.zooworkers;

public class Cashier extends ZooWorker{

    public Cashier(int ID, String name, String surname, int salary, int experience) {
        super(ID, name, surname, salary, experience);
    }

    private int ticketPrice;

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void sellTicket(boolean asked, int age){
        if (asked && age < 18) {
            System.out.println("Cashier sells a ticket for " + ticketPrice/2 + " dollars.");
        } else {
            System.out.println("Cashier sells a ticket for " + ticketPrice + " dollars.");
        }
    }
}
