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
        if (countBooks > LEN - 1) {
            System.out.println("Шкаф полный. Необходимо очистить шкаф, либо удалить книгу!");
        } else if (countBooks < LEN) {
            books[countBooks++] = book;
            updateLenShelves(book.getLen());
            return true;
        }
        return false;
    }

    public boolean delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                int currentLen = books[i].getLen();
                if (i != --countBooks) {
                    System.arraycopy(books, i + 1, books, i, countBooks - i + 1);
                }
                books[countBooks] = null;
                updateLenShelves(currentLen);
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

    public void updateLenShelves(int currentLen) {
        if (lenShelves <= currentLen) {
            lenShelves = books[0].getLen();
            for (int i = 1; i < countBooks; i++) {
                if (books[i].getLen() > lenShelves) {
                    lenShelves = books[i].getLen();
                }
            }
        }
    }
}
