package ru.mirea.ikbo2019.pr1;

import java.time.Year;

public class Book {
    private boolean isread;
    private int pageCount;
    private int year;

    public Book(boolean isread, int pageCount, int year) {
        this.isread = isread;
        this.pageCount = pageCount;
        this.year = year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean getStatus() {
        return isread;
    }
    public int getYear(){
        return year;
    }

    public String toString(){
        return "Page count: "+ this.pageCount +" written in " + this.year + " Status: " + this.isread;
    }
}
