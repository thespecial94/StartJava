package com.startjava.graduation;

public class Book {
    private final String author;
    private final String name;
    private final int yearPublication;
    private final int len;

    public Book(String author, String name, int yearPublication, int len) {
        this.author = author;
        this.name = name;
        this.yearPublication = yearPublication;
        this.len = len;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public int getLen() {
       return len;
    }
}
