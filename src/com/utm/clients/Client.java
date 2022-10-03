package com.utm.clients;

import com.utm.intermidLvl.Person;

abstract public class Client extends Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClientName() {
        String[] names = {"Bob", "Jill", "Tom", "Brandon", "Liam", "Noah", "Olivia", "Emma", "Ava", "Oliver",
                "Sophia", "Isabella", "William", "Charlotte", "Mia", "James", "Lucas", "Benjamin", "Ethan", "Amelia"};
        int index = (int) (Math.random() * names.length);
        return names[index];
    }

    public String getClientSurname() {
        String[] surnames = {"Smith", "Johnson", "Williams", "Jones", "Garcia", "Perez", "White", "Clark", "Scott", "Hill",
                "Miller", "Davis", "Rodriguez", "Martinez", "Lopez", "Taylor", "Thomas", "Lee", "Lewis", "Allen"};
        int index = (int) (Math.random() * surnames.length);
        return surnames[index];
    }
    abstract void buyTicket();

    abstract void enterZoo();
}
