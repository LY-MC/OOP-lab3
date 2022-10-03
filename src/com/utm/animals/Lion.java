package com.utm.animals;

import java.time.Instant;
import java.util.Random;

public class Lion extends Animal {
    public Lion() {
        super();
        Random random = new Random();
        setAge(random.nextInt(15) + 1);
        setMale(random.nextBoolean());
        setIll(random.nextBoolean());
        setHungry(random.nextBoolean());
        setHeight(random.nextInt(20) + 100);
        setID(getRandomID());
        if (isMale()) {
            setWeight(random.nextInt(100) + 150);
        } else {
            setWeight(random.nextInt(60) + 120);

        }
    }


    @Override
    public void makeSound() {
        System.out.println("roar r-r-r");
    }

    @Override
    public String toString() {
        return "Lion{" +
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
