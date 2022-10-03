package com.utm.zooworkers;

public class Zookeeper extends ZooWorker{
    private boolean isFeeding;
    private boolean isCleaning;

    public Zookeeper(int ID, String name, String surname, int salary, int experience) {
        super(ID, name, surname, salary, experience);
    }

    public boolean isFeeding() {
        return isFeeding;
    }

    public void setFeeding(boolean feeding) {
        isFeeding = feeding;
    }

    public boolean isCleaning() {
        return isCleaning;
    }

    public void setCleaning(boolean cleaning) {
        isCleaning = cleaning;
    }
}
