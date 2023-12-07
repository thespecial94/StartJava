package com.startjava.graduation;

import java.util.Arrays;

public class Bookshelf {

    public static final int LEN = 10;
    private final Book[] books = new Book[LEN];
    private int countBooks;
    private int maxLen;
    private int tmpIndexCurrentLen;

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountFreeShelves() {
        return LEN - countBooks;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public boolean add(Book book) {
        if (countBooks < LEN) {
            books[countBooks++] = book;
            if (books[countBooks - 1].getLen() > maxLen) {
                tmpIndexCurrentLen = countBooks - 1;
            }
            return true;
        }
        return false;
    }

    public boolean delete(String name) {
        for (int i = 0; i < LEN; i++) {
            if (i < countBooks && books[i].getName().equals(name)) {
                if (maxLen == books[i].getLen()) {
                    maxLen = 0;
                    tmpIndexCurrentLen = 0;
                }
                System.arraycopy(books, i + 1, books, i, LEN - 1 - i);
                books[LEN - 1] = null;
                countBooks--;
                return true;
            }
        }
        return false;
    }

    public boolean find(String name) {
        for (int i = 0; i < LEN; i++) {
            if (i < countBooks && books[i].getName().equals(name) ) {
                return true;
            }
        }
        return false;
    }

    public boolean clear() {
        if (countBooks > 0) {
            Arrays.fill(books, 0, LEN, null);
            countBooks = 0;
            maxLen = 0;
            tmpIndexCurrentLen = 0;
            return true;
        }
        return false;
    }


    public int getMaxLen() {
        if (countBooks > 0) {
            if (books[tmpIndexCurrentLen].getLen() >= maxLen) {
                maxLen = books[0].getLen();
                for (int i = 1; i < countBooks; i++) {
                    if (books[i].getLen() > maxLen) {
                        maxLen = books[i].getLen();
                    }
                }
            }
        }
        return maxLen;
    }
}
