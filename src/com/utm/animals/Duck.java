package com.utm.animals;

import java.util.Random;

public class Duck extends Animal {
    public Duck() {
        super();
        Random random = new Random();
        setAge(random.nextInt(9) + 1);
        setMale(random.nextBoolean());
        setIll(random.nextBoolean());
        setHungry(random.nextBoolean());
        setWeight(random.nextInt(2) + 1);
        setHeight(random.nextInt(27) + 50);
        setID(getRandomID());
    }


    @Override
    public void makeSound() {
        System.out.println("quack, quack, quack");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "weight=" + getWeight() +
                ", height=" + getHeight() +
                ", age=" + getAge() +
                ", isMale=" + isMale() +
                ", isIll=" + isIll() +
                ", isHungry=" + isHungry() +
                ", ID=" + getID() +
                '}';
    }
}
