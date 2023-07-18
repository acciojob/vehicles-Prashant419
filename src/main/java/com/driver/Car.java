package com.driver;

public class Car extends Vehicle { // Car Blueprint
    private int wheels; // Atrributes of Car
    private String type; // Atrributes of Car
    private int doors; // Atrributes of Car
    private int gears; // Atrributes of Car
    private boolean isManual; // Atrributes of Car
    private int currentGear; // Atrributes of Car
    private int seats; // Atrributes of Car

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {

        //Initializing variables
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;

    }

    public void changeGear(int newGear){

        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public int getGears() {
        return gears;
    }
}
