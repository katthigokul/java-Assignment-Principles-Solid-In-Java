package com.stackroute.JavaSolidPrinciples;

/*Toycar class using interface of ToyBulider */

public class ToyCar implements Toy, Movable {
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
        System.out.println("ToyCar: is of Moving type");

    }


    @Override
    public String toString() {
        return "Toycar: movable Toy car- price: " + price + " color: " + color;

    }
}