package com.startjava.graduation;

import java.util.Arrays;

public class Bookshelf {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int LEN = 10;
    private final Book[] books = new Book[LEN];
    private boolean quit = true;
    private int currentLen;
    private int maxLen;

    public Book[] getBooks() {
        return books;
    }

    public int getCountFreeShelves() {
        int countFreeShelves = ZERO;
        for (int i = LEN - ONE; i >= ZERO; i--) {
            if (books[i] == null) {
                countFreeShelves++;
            } else {
                break;
            }
        }
        return countFreeShelves;
    }

    public int getCountBooks() {
        int countBooks = ZERO;
        for (int i = ZERO; i < LEN; i++) {
            if (books[i] == null) {
                break;
            } else  {
                countBooks++;
            }
        }
        return countBooks;
    }

    public boolean add(String author, String name, int yearPublication) {
        currentLen = (author + name + yearPublication).length();
        Book book = new Book(author, name, yearPublication, currentLen);
        for (int i = ZERO; i < LEN; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }
        return false;
    }

    public boolean delete(String name) {
        for (int i = ZERO; i < LEN; i++) {
            if (books[i] == null) {
                break;
            } else if (books[i].getName().equals(name)) {
                currentLen = books[i].getLen();
                System.arraycopy(books, i + ONE, books, i, LEN - ONE - i);
                books[LEN - ONE] = null;
                return true;
            }
        }
        return false;
    }

    public boolean find(String name) {
        for (int i = ZERO; i < LEN; i++) {
            if (books[i] == null) {
                break;
            } else if (books[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean clear() {
        if (getCountBooks() > ZERO) {
            Arrays.fill(books, ZERO, LEN, null);
            return true;
        }
        return false;
    }

    public boolean getQuit() {
        return quit;
    }

    public boolean setQuit(boolean quit) {
         this.quit = quit;
         return true;
    }

    public int getMaxLen() {
        if (getCountBooks() > ZERO) {
            if (currentLen >= maxLen) {
                maxLen = books[ZERO].getLen();
                for (int i = ONE; i < LEN; i++) {
                    if (books[i] == null) {
                        return maxLen;
                    } else if (books[i].getLen() > maxLen) {
                        maxLen = books[i].getLen();
                    }
                }
            }
        }
        return maxLen;
    }
}
