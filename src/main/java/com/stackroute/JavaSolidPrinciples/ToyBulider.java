package com.stackroute.JavaSolidPrinciples;
/*Design the system with skeleton code.
        You are developing a Java application that models a toy builder. Each toy will have a price and
        color. Some toys, such as a toy car or toy train can additionally move, while some toys, such as
        a toy plane can both move and fly.*/

public class ToyBulider {
    public static void main(String[] args) {

        ToyCar car = new ToyCar();
        ToyFlight plane = new ToyFlight();


        car.setColor("White");
        car.setPrice(20000.00);

        plane.setColor("White");
        plane.setPrice(150000.00);

        System.out.println("----------------Toys---------------");
        System.out.println();

        car.move();
        System.out.println("The color of car toy is: " + car.getColor());
        System.out.println("The price of car toy is: " + car.getPrice());
        System.out.println();


        plane.move();
        plane.fly();
        System.out.println("The color of plane toy is: " + plane.getColor());
        System.out.println("The price of plane toy is: " + plane.getPrice());
        System.out.println();


    }

}
