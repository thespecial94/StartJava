package com.startjava.graduation;

import java.util.Arrays;

public class Bookshelf {

    public static final int LEN = 10;
    private final Book[] books = new Book[LEN];
    private int countBooks;
    private int lenShelves;

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountFreeShelves() {
        return LEN - countBooks;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getLenShelves(){
        return lenShelves;
    }

    public boolean add(Book book) {
        if (countBooks < LEN) {
            books[countBooks++] = book;
            updateLenShelfs(book);
            return true;
        }
        return false;
    }

    public boolean delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                if (lenShelves == books[i].getLen()) {
                    lenShelves = 0;
                }
                books[i] = null;
                if (i != --countBooks) {
                    System.arraycopy(books, i + 1, books, i, countBooks - i + 1);
                }
                updateLenShelfs(books[i]);
                return true;
            }
        }
        return false;
    }

    public boolean find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title) ) {
                return true;
            }
        }
        return false;
    }

    public boolean clear() {
        if (countBooks > 0) {
            Arrays.fill(books, 0, countBooks, null);
            countBooks = 0;
            lenShelves = 0;
            return true;
        }
        return false;
    }

    public void updateLenShelfs(Book book) {
        if (lenShelves == 0) {
            lenShelves = books[0].getLen();
            for (int i = 1; i < countBooks; i++) {
                if (books[i].getLen() > lenShelves) {
                    lenShelves = books[i].getLen();
                }
            }
        } else if (book != null && book.getLen() > lenShelves) {
            lenShelves = book.getLen();
        }
    }
}
