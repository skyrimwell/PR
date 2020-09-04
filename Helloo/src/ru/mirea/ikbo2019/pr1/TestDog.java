package ru.mirea.ikbo2019.pr1;
import java.lang.*;

public class TestDog {
    public static void main(String[] args)
    {
        Dog Sparky = new Dog ("Sparky", 4);
        Dog Dogmeat = new Dog ("Dogmeat", 8);
        Dog Max = new Dog ("Max", 5);
        Sparky.setAge(4.1);
        System.out.println(Sparky);
        Sparky.intoHumanAge();
        Dogmeat.intoHumanAge();
        Max.intoHumanAge();
    }
}
