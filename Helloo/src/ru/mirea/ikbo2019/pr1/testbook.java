package ru.mirea.ikbo2019.pr1;
import java.lang.*;
public class testbook {
    public static void main(String[] args)
    {
        Book book1 = new Book(true, 1500, 1999);
        Book lovecraft = new Book (true, 300, 1926);
        book1.getPageCount();
        book1.getStatus();
        book1.getYear();
        System.out.println(lovecraft);

    }
}
