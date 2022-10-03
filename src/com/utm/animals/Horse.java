package com.utm.animals;

import java.time.Instant;
import java.util.Random;

public class Horse extends Animal {
    public Horse() {
        super();
        Random random = new Random();
        setAge(random.nextInt(29) + 1);
        setMale(random.nextBoolean());
        setIll(random.nextBoolean());
        setHungry(random.nextBoolean());
        setWeight(random.nextInt(90) + 360);
        setHeight(random.nextInt(15) + 140);
        setID(getRandomID());
    }

    @Override
    public void makeSound() {
        System.out.println("Woo hoo hoo hoooo");
    }

    @Override
    public String toString() {
        return "Horse{" +
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
