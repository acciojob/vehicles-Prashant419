package com.driver;

public class Boat implements WaterVehicle{

    public String name;
    public int capacity;
    public Boat(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }
    public String getVehicleName() // getter function
    {
        return name;

    }
    public int getVehicleCapacity(){ // getter function
        return capacity;
    }
}