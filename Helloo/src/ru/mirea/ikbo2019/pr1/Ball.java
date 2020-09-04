package ru.mirea.ikbo2019.pr1;

public class Ball {
    private double weight;
    private String color;

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight()
    {
        return weight;
    }
    public String getcolor()
    {
        return color;
    }
    public void changeweight(double weight){
        this.weight = weight;
    }
    public String toString(){
        return "Ball is "+ this.color + ", and weights a " + this.weight + "kg.";
    }
}
