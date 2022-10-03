package com.utm.miscellaneous;

import com.utm.animals.*;
import com.utm.enums.AnimalType;
import com.utm.root.Entity;

import java.util.ArrayList;
import java.util.List;

public class Cage extends Entity {

    private int width;
    private int length;
    private final List<Animal> animalList = new ArrayList<>();

    public Cage(int ID, int width, int length) {
        super(ID);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void populateCage(int count, AnimalType animalType) {
        while (count-- > 0) {
            switch (animalType) {
                case MONKEY:
                    this.animalList.add(new Monkey());
                    break;
                case ELEPHANT:
                    this.animalList.add(new Elephant());
                    break;
                case HORSE:
                    this.animalList.add(new Horse());
                    break;
                case LION:
                    this.animalList.add(new Lion());
                    break;
                case DUCK:
                    this.animalList.add(new Duck());
                    break;
            }
            }
        }

    public void printAnimalsInCage() {
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}
