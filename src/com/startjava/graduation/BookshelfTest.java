package com.startjava.graduation;

import java.util.Scanner;
public class BookshelfTest {

    static final int DELETE = 1;
    static final int CLEAR = 2;
    static final int ADD = 3;
    static final int FIND = 4;
    static final int QUIT = 5;
    static final String INPUT_AUTHOR = "Введите имя автора: ";
    static final String INPUT_NAME = "Введите название книги: ";
    static final String INPUT_YEAR = "Введите год издания: ";
    private final Scanner scanner = new Scanner(System.in);
    private boolean success = false;
    private int numberCommand;
    private int maxLen;

    public static void main(String[] args) {
        BookshelfTest bookshelfTest = new BookshelfTest();
        Bookshelf bookshelf = new Bookshelf();
        do {
            try {
                bookshelfTest.outputMenu(bookshelf);
                bookshelfTest.inputNumber(bookshelf);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (bookshelfTest.numberCommand != QUIT);
    }

    public void outputMenu(Bookshelf bookshelf) {
        String menu = """
        1. Удалить книгу
        2. Очистить шкаф
        3. Добавить книгу
        4. Найти книгу
        5. Завершить
        """;
        System.out.println(menu);
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    public void inputNumber(Bookshelf bookshelf) {
        System.out.print("Введите номер команды: ");
        numberCommand = Integer.parseInt(scanner.nextLine());
        if (numberCommand == ADD && bookshelf.getCountBooks() > Bookshelf.LEN - 1) {
            System.out.println("Шкаф полный. Необходимо очистить шкаф, либо удалить книгу!");
        } else {
            executeCommands(bookshelf);

            if (numberCommand != QUIT) {
                output(bookshelf);

                System.out.println("Для продолжения нажмите Enter");
                scanner.nextLine();
            }
        }
    }

    private void executeCommands(Bookshelf bookshelf) {
        try {
            success = switch (numberCommand) {
                case DELETE -> {
                    System.out.print(INPUT_NAME);
                    yield bookshelf.delete(scanner.nextLine());
                }
                case CLEAR -> bookshelf.clear();
                case ADD -> {
                    System.out.print(INPUT_AUTHOR);
                    String author = scanner.nextLine();
                    System.out.print(INPUT_NAME);
                    String title = scanner.nextLine();
                    System.out.print(INPUT_YEAR);
                    int yearPublication = scanner.nextInt();
                    Book book = new Book(author, title, yearPublication);
                    scanner.nextLine();
                    yield bookshelf.add(book);
                }
                case FIND -> {
                    System.out.print(INPUT_NAME);
                    yield bookshelf.find(scanner.nextLine());
                }
                default -> throw new IllegalStateException("Недопустимая команда");
            };
            printMessage();

        } catch (RuntimeException e) {
            if (numberCommand == DELETE) {
                throw new IllegalStateException("При удалении книги произошла ошибка: " + e.getMessage());
            } else if (numberCommand == CLEAR) {
                throw new IllegalStateException("При очистки шкафа произошла ошибка: " + e.getMessage());
            } else if (numberCommand == ADD) {
                throw new IllegalStateException("При добавлении книги произошла ошибка: " + e.getMessage());
            } else if (numberCommand == FIND) {
                throw new IllegalStateException("При поиски книги произошла ошибка: " + e.getMessage());
            }
        }
    }

    public void printMessage() {
        if (success && numberCommand == DELETE) {
            System.out.println("Книга удалена!");
        } else if (numberCommand == DELETE) {
            System.out.println("Книга не удалена!");
        }
        if (success && numberCommand == CLEAR) {
            System.out.println("Шкаф очищен!");
        } else if (numberCommand == CLEAR) {
            System.out.println("Шкаф не очищен, так как пуст!");
        }
        if (success && numberCommand == ADD) {
            System.out.println("Книга добавлена!");
        } else if (numberCommand == ADD) {
            System.out.println("Книга не добавлена!");
        }
        if (success && numberCommand == FIND) {
            System.out.println("Книга найдена!");
        } else if (numberCommand == FIND) {
            System.out.println("Книга не найдена!");
        }
    }

    private void output(Bookshelf bookshelf) {
        System.out.println("В шкафу книг - " + bookshelf.getCountBooks() +
                ", свободно полок - " + bookshelf.getCountFreeShelves());
        System.out.println();
        if ((numberCommand == DELETE || numberCommand == ADD) && success) {
            maxLen = bookshelf.getMaxLen();
        }
        String strDash = "-".repeat(maxLen + 4);
        for (int i = 0; i < bookshelf.getCountBooks(); i++) {
            String strWhiteSpace = maxLen == bookshelf.getBooks()[i].getLen() ? "" :
                    " ".repeat(maxLen - bookshelf.getBooks()[i].getLen());
            System.out.println("|" + bookshelf.getBooks()[i].toString() + strWhiteSpace + "|");
            System.out.println("|" + strDash + "|");
        }
        if (bookshelf.getCountBooks() > 0) {
            System.out.println("|" + " ".repeat(maxLen + 4) + "|");
        }
    }
}
