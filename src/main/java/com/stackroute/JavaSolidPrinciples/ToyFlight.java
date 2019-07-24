package com.stackroute.JavaSolidPrinciples;

/*ToyFlight class using interface of ToyBulider */

public  class ToyFlight implements Toy,Movable, flyable {
    private double price;
    private String color;


    @Override
    public void setPrice(double price) {
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;

    }

    @Override
    public void move() {
        System.out.println("ToyFlight: Starts Moving");



    }

    @Override
    public void fly() {
        System.out.println("ToyFlight: Starts Flying ");

    }

    @Override
    public String toString() {
        return "ToyFlight: Flyable Toy Flight- price: " + price + " color: " + color;
    }
}
