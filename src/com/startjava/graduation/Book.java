package com.startjava.graduation;

public class Book {

    private final String author;
    private final String title;
    private final int yearPublication;
    private final int len;

    public Book(String author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
        this.len = (author + title + yearPublication).length();
    }

    public String getName() {
        return title;
    }

    public int getLen() {
       return len;
    }

    public String toString() {
        return author + ", " + title + ", " + yearPublication;
    }
}
