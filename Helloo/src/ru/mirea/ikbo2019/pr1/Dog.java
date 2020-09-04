package ru.mirea.ikbo2019.pr1;

import javax.swing.plaf.IconUIResource;

public class Dog {
    private String name;
    private double age;

    public Dog(String n, int a)
    {
        name = n;
        age = a;
    }
    public Dog(){
        name = "Sparky";
        age = 0;
    }

    public void setCurrentName(String name)
    {
        this.name = name;
    }
    public void setAge(double age)
    {
        this.age = age;
    }
    public String getName(String name){
        return name;
    }
    public double getAge(){
        return age;
    }
    public String toString()
    {
        return this.name+", age "+this.age;
    }
    public void intoHumanAge()
    {
        System.out.println(name+"'s age in human years is " +age*7+" years");
    }
}
