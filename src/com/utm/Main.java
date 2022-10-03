package com.utm;

import java.util.Random;

import com.utm.clients.Adult;
import com.utm.clients.Child;
import com.utm.clients.Client;
import com.utm.enums.AnimalType;
import com.utm.miscellaneous.Cage;
import com.utm.miscellaneous.CageWithLake;
import com.utm.zooworkers.Cashier;
import com.utm.zooworkers.SecurityGuard;
import com.utm.zooworkers.Veterinarian;
import com.utm.zooworkers.Zookeeper;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create all instances
        Cage monkeyCage = new Cage(1, 300, 300);
        monkeyCage.populateCage(3, AnimalType.MONKEY);
        Cage elephantCage = new Cage(2, 500, 1000);
        elephantCage.populateCage(2, AnimalType.ELEPHANT);
        Cage horseCage = new Cage(3, 850, 900);
        horseCage.populateCage(4, AnimalType.HORSE);
        Cage lionCage = new Cage(4, 600, 940);
        lionCage.populateCage(2, AnimalType.LION);
        CageWithLake duckCage = new CageWithLake(5, 400, 400 ,200, 150);
        duckCage.populateCage(4, AnimalType.DUCK);
        System.out.println("In the cages we have:");
        elephantCage.printAnimalsInCage();
        horseCage.printAnimalsInCage();
        lionCage.printAnimalsInCage();
        monkeyCage.printAnimalsInCage();
        duckCage.printAnimalsInCage();
        Thread.sleep(5000);
        System.out.println();

        Adult adult = new Adult();
        Child child = new Child();
        Cashier cashier = new Cashier(400800200, "Vicki", "Richardson",1500, 5);
        Veterinarian veterinarian = new Veterinarian(983467829, "Robyn", "Robson", 2500, 3);
        Zookeeper zookeeper = new Zookeeper(476389546, "Stefan", "Williamson", 1700, 4);
        SecurityGuard securityGuard = new SecurityGuard(285763839, "Andy", "Berg", 1000, 1);
        Random rand = new Random();
        int timeStamp = 8;

        // Main simulation loop
        while (true) {
            System.out.println("Time " + timeStamp + ":00");

            if (timeStamp == 19) {
                System.out.println("DISCOUNT FOR TICKETS!");
            }

            int appear = rand.nextInt(100);
            int age = rand.nextInt(80);
            if (appear % 2 == 0) {
                if (age < 18) {
                    child.setAge(age);
                    child.buyTicket();
                    child.setName(child.getClientName());
                    child.setSurname(child.getClientSurname());
                    child.setID(child.getRandomID());
                } else {
                    adult.setAge(age);
                    adult.buyTicket();
                    adult.setName(adult.getClientName());
                    adult.setSurname(adult.getClientSurname());
                    adult.setID(adult.getRandomID());
                }

                if (timeStamp < 19) {
                    cashier.setTicketPrice(10);
                } else {
                    cashier.setTicketPrice(6);
                }
                cashier.sellTicket(true, age);
                if (age < 18) {
                    child.enterZoo();
                } else {
                    adult.enterZoo();
                }

                System.out.println("Animals:");
                elephantCage.getAnimalList().get(0).makeSound();
                horseCage.getAnimalList().get(0).makeSound();
                lionCage.getAnimalList().get(0).makeSound();
                monkeyCage.getAnimalList().get(0).makeSound();
                duckCage.getAnimalList().get(0).makeSound();
            }

            int treating = rand.nextInt(100);
            veterinarian.setTreating(treating % 2 == 0);
            if (veterinarian.isTreating()) {
                System.out.println("Veterinarian is treating an animal.");
            }

            int cleaning = rand.nextInt(100);
            zookeeper.setCleaning(cleaning % 2 == 0);
            int feeding = rand.nextInt(100);
            zookeeper.setFeeding(feeding % 2 == 0);
            if (zookeeper.isCleaning()) {
                System.out.println("Zookeeper is cleaning the cage");
            } else if (zookeeper.isFeeding()) {
                System.out.println("Zookeeper is feeding the animals");
            }

            int sleeping = rand.nextInt(100);
            securityGuard.setSleeping(sleeping % 2 == 0);
            if (securityGuard.isSleeping()) {
                securityGuard.setHoursSlept(securityGuard.getHoursSlept() + 1);
            }
            if (securityGuard.getHoursSlept() > 2) {
                securityGuard.setSleeping(false);
                securityGuard.setHoursSlept(0);
            }
            if (securityGuard.isSleeping()) {
                System.out.println("Security guard is sleeping");
            } else {
                System.out.println("Security guard is not sleeping");
            }

            timeStamp++;
            if (timeStamp >= 21) {
                timeStamp = 8;
            }

            System.out.println();
            Thread.sleep(3000);
        }
    }
}
