package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;


    public int getCurrentDirection(){
        return getCurrentDirection();
    }
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels  = wheels;
        this.doors  = doors;
        this.gears  = 1;
        this.isManual  = isManual;
        this.type  = type;
        this.seats  = seats;
    }

    public int getGears() {
        return gears;
    }

    public Car(String name , boolean isManual){
        super(name);
        this.isManual  = isManual;

    }
    public void changeGear(int newGear){

        this.gears  = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
                move(newSpeed , newDirection);
                int speed  = getCurrentSpeed();
                if(speed>=0 && speed<=50)
                    gears  = 1;
                else if(speed>=51 && speed<=100)
                    gears = 2;
                else if(speed>=101 && speed<=150)
                    gears  = 3;
                else if(speed>=151 && speed<=200)
                    gears  = 4;
                else if(speed>=201 && speed<=250)
                    gears  = 5;
                else if(gears>250){
                    gears  = 6;
                }
                System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }


}
