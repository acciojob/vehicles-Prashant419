package com.driver;

public class Car extends Vehicle { // object of vehicle that inheritances
    private int wheels; // Attributes of Car
    private String type; // Attributes of Car
    private int doors; // Attributes of Car
    private int gears; // Attributes of Car
    private boolean isManual; // Attributes of Car
    private int currentGear; // Attributes of Car
    private int seats; // Attributes of Car

    public int currentSpeed=super.getCurrentSpeed(); //invoke the parent class’s implementation of the method in addition to its own
    public int currentDirection=super.getCurrentDirection(); //invoke the parent class’s implementation of the method in addition to its own


// Constructor
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name); // invoke the parent class’s implementation of the method in addition to its own.
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.seats=seats;


    }

    public void changeGear(int newGear){
        this.currentGear=newGear;

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed,newDirection); // go to move function 

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}