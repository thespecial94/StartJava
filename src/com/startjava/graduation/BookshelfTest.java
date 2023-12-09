package com.startjava.graduation;

import java.util.Scanner;

public class BookshelfTest {

    private static final int DELETE = 1;
    private static final int CLEAR = 2;
    private static final int ADD = 3;
    private static final int FIND = 4;
    private static final int QUIT = 5;
    private static final String INPUT_AUTHOR = "Введите имя автора: ";
    private static final String INPUT_NAME = "Введите название книги: ";
    private static final String INPUT_YEAR = "Введите год издания: ";
    private final Scanner scanner = new Scanner(System.in);
    private boolean success = false;
    private int numberCommand;
    private int lenShelves;

    public static void main(String[] args) {
        BookshelfTest bookshelfTest = new BookshelfTest();
        Bookshelf bookshelf = new Bookshelf();
        do {
            try {
                bookshelfTest.outputMenu(bookshelf);
                bookshelfTest.inputMenuItem();
                bookshelfTest.executeCommand(bookshelf);
                bookshelfTest.output(bookshelf);
                bookshelfTest.quit();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (bookshelfTest.numberCommand != QUIT);
    }

    private void outputMenu(Bookshelf bookshelf) {
        System.out.println("""
                1. Удалить книгу
                2. Очистить шкаф
                3. Добавить книгу
                4. Найти книгу
                5. Завершить
                """);
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    private void inputMenuItem() {
        System.out.print("Введите номер команды: ");
        numberCommand = Integer.parseInt(scanner.nextLine());
    }

    private void executeCommand(Bookshelf bookshelf) {
        switch (numberCommand) {
            case DELETE -> delete(bookshelf);
            case CLEAR -> clear(bookshelf);
            case ADD -> add(bookshelf);
            case FIND -> find(bookshelf);
            case QUIT -> System.out.println("Завершение процесса!");
            default -> throw new IllegalStateException("Недопустимая команда");
        }
    }

    private void delete(Bookshelf bookshelf) {
        System.out.print(INPUT_NAME);
        success = bookshelf.delete(scanner.nextLine());
        if (success) {
            System.out.println("Книга удалена!");
        } else {
            System.out.println("Книга не удалена!");
        }
    }

    private void clear(Bookshelf bookshelf) {
        success = bookshelf.clear();
        if (success) {
            System.out.println("Шкаф очищен!");
        } else {
            System.out.println("Шкаф не очищен, так как пуст!");
        }
    }

    private void add(Bookshelf bookshelf) {
        System.out.print(INPUT_AUTHOR);
        String author = scanner.nextLine();
        System.out.print(INPUT_NAME);
        String title = scanner.nextLine();
        System.out.print(INPUT_YEAR);
        int yearPublication = scanner.nextInt();
        Book book = new Book(author, title, yearPublication);
        scanner.nextLine();
        success = bookshelf.add(book);
        if (success) {
            System.out.println("Книга добавлена!");
        } else {
            System.out.println("Книга не добавлена!");
        }
    }

    private void find(Bookshelf bookshelf) {
        System.out.print(INPUT_NAME);
        success = bookshelf.find(scanner.nextLine());
        if (success) {
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

    private void output(Bookshelf bookshelf) {
        System.out.println("В шкафу книг - " + bookshelf.getCountBooks() +
                ", свободно полок - " + bookshelf.getCountFreeShelves());
        System.out.println();
        if ((numberCommand == DELETE || numberCommand == ADD) && success) {
            lenShelves = bookshelf.getLenShelves();
        }
        String strDash = "-".repeat(lenShelves);
        for (int i = 0; i < bookshelf.getCountBooks(); i++) {
            String strWhiteSpace = lenShelves == bookshelf.getBooks()[i].getLen() ? "" :
                    " ".repeat(lenShelves - bookshelf.getBooks()[i].getLen());
            System.out.println("|" + bookshelf.getBooks()[i].toString() + strWhiteSpace + "|");
            System.out.println("|" + strDash + "|");
        }
        if (bookshelf.getCountBooks() > 0) {
            System.out.println("|" + " ".repeat(lenShelves) + "|");
        }
    }
}
