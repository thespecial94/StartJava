package com.startjava.graduation;

import java.util.Scanner;

public class BookshelfTest {

    private static final int DELETE = 1;
    private static final int CLEAR = 2;
    private static final int ADD = 3;
    private static final int FIND = 4;
    private static final int QUIT = 5;
    private static final String INPUT_AUTHOR = "Введите имя автора: ";
    private static final String INPUT_TITLE = "Введите название книги: ";
    private static final String INPUT_YEAR = "Введите год издания: ";
    private final Bookshelf bookshelf = new Bookshelf();
    private final Scanner scanner = new Scanner(System.in);
    private int numberCommand;
    private int lenShelves;

    public static void main(String[] args) {
        BookshelfTest bookshelfTest = new BookshelfTest();
        do {
            bookshelfTest.outputMenu();
            try {
                bookshelfTest.inputMenuItem();
                bookshelfTest.executeCommand();
                bookshelfTest.output();
                bookshelfTest.quit();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (bookshelfTest.numberCommand != QUIT);
    }

    private void outputMenu() {
        System.out.println("""
                1. Удалить книгу
                2. Очистить шкаф
                3. Добавить книгу
                4. Найти книгу
                5. Завершить
                """);
    }

    private void inputMenuItem() {
        System.out.print("Введите номер команды: ");
        numberCommand = Integer.parseInt(scanner.nextLine());
    }

    private void executeCommand() {
        switch (numberCommand) {
            case DELETE -> delete();
            case CLEAR -> clear();
            case ADD -> add();
            case FIND -> find();
            case QUIT -> System.out.println("Будем рады тебя увидеть снова, процесс книжный шкаф завершается!!!");
            default -> throw new IllegalStateException("Недопустимая команда");
        }
    }

    private void delete() {
        System.out.print(INPUT_TITLE);
        if (bookshelf.delete(scanner.nextLine())) {
            System.out.println("Книга удалена!");
        } else {
            System.out.println("Книга не удалена!");
        }
    }

    private void clear() {
        if (bookshelf.clear()) {
            System.out.println("Шкаф очищен!");
        } else {
            System.out.println("Шкаф не очищен, так как пуст!");
        }
    }

    private void add() {
        System.out.print(INPUT_AUTHOR);
        String author = scanner.nextLine();
        System.out.print(INPUT_TITLE);
        String title = scanner.nextLine();
        System.out.print(INPUT_YEAR);
        int yearPublication = scanner.nextInt();
        Book book = new Book(author, title, yearPublication);
        scanner.nextLine();
        if (bookshelf.add(book)) {
            System.out.println("Книга добавлена!");
        } else {
            System.out.println("Книга не добавлена!");
        }
    }

    private void find() {
        System.out.print(INPUT_TITLE);
        if (bookshelf.find(scanner.nextLine())) {
            System.out.println("Книга найдена!");
        } else {
            System.out.println("Книга не найдена!");
        }
    }

    private void quit() {
        if (numberCommand != QUIT) {
            System.out.println("Для продолжения нажмите Enter");
            scanner.nextLine();
        }
    }

    private void output() {
        printBookshelfEmpty();

        System.out.println("В шкафу книг - " + bookshelf.getCountBooks() +
                ", свободно полок - " + bookshelf.getCountFreeShelves());
        System.out.println();
        if (numberCommand == DELETE || numberCommand == ADD) {
            lenShelves = bookshelf.getLenShelves();
        }
        String dash = "-".repeat(lenShelves);
        for (Book book : bookshelf.getBooks()) {
            String whiteSpace = lenShelves == book.getLen() ? "" : " ".repeat(lenShelves - book.getLen());
            System.out.println("|" + book + whiteSpace + "|");
            System.out.println("|" + dash + "|");
        }
        if (bookshelf.getCountBooks() > 0) {
            System.out.println("|" + " ".repeat(lenShelves) + "|");
        }
    }

    private void printBookshelfEmpty() {
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }
}
