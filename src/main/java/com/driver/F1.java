package com.driver;

public class F1 extends Car {



    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name , isManual);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

         int gear  = getGears();
         if(gear == 1)
             newSpeed  = 0;
         else if(gear  == 2)
             newSpeed = 67;
         else if(gear == 3)
             newSpeed  = 135;
         else if(gear  == 4)
             newSpeed  = 170;
         else if(gear  == 5)
             newSpeed  = 225;
         else if(gear==6)
             newSpeed  = 270;

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
             super.changeGear(1);
             super.changeSpeed(0 , 0);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
