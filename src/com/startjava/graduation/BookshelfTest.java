package com.startjava.graduation;

import java.util.Scanner;
public class BookshelfTest {
    static final int TWO = 2;
    static final int THREE = 3;
    static final int FOUR = 4;
    static final int FIVE = 5;
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
        } while (bookshelf.getQuit());
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
        if (bookshelf.getCountBooks() == Bookshelf.ZERO) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    public void inputNumber(Bookshelf bookshelf) {
        System.out.print("Введите номер команды: ");
        numberCommand = Integer.parseInt(scanner.nextLine());
        if (numberCommand == THREE && bookshelf.getCountBooks() > FOUR + FIVE) {
            System.out.println("Шкаф полный. Необходимо очистить шкаф, либо удалить книгу!");
        } else {
            callMethods(bookshelf);

            if (numberCommand != FIVE) {
                output(bookshelf);

                System.out.println("Для продолжения нажмите Enter");
                scanner.nextLine();
            }
        }
    }

    private void callMethods(Bookshelf bookshelf) {
        try {
            success = switch (numberCommand) {
                case Bookshelf.ONE -> {
                    System.out.print(INPUT_NAME);
                    yield bookshelf.delete(scanner.nextLine());
                }
                case TWO -> bookshelf.clear();
                case THREE -> {
                    System.out.print(INPUT_AUTHOR);
                    String author = scanner.nextLine();
                    System.out.print(INPUT_NAME);
                    String name = scanner.nextLine();
                    System.out.print(INPUT_YEAR);
                    int yearPublication = scanner.nextInt();
                    scanner.nextLine();
                    yield bookshelf.add(author, name, yearPublication);
                }
                case FOUR -> {
                    System.out.print(INPUT_NAME);
                    yield bookshelf.find(scanner.nextLine());
                }
                case FIVE -> bookshelf.setQuit(false);
                default -> throw new IllegalStateException("Недопустимая команда");
            };
            printMessage();

        } catch (RuntimeException e) {
            if (numberCommand == Bookshelf.ONE) {
                throw new IllegalStateException("При удалении книги произошла ошибка: " + e.getMessage());
            } else if (numberCommand == TWO) {
                throw new IllegalStateException("При очистки шкафа произошла ошибка: " + e.getMessage());
            } else if (numberCommand == THREE) {
                throw new IllegalStateException("При добавлении книги произошла ошибка: " + e.getMessage());
            } else if (numberCommand == FOUR) {
                throw new IllegalStateException("При поиски книги произошла ошибка: " + e.getMessage());
            }
        }
    }

    public void printMessage() {
        if (success && numberCommand == Bookshelf.ONE) {
            System.out.println("Книга удалена!");
        } else if (numberCommand == Bookshelf.ONE) {
            System.out.println("Книга не удалена!");
        }
        if (success && numberCommand == TWO) {
            System.out.println("Шкаф очищен!");
        } else if (numberCommand == TWO) {
            System.out.println("Шкаф не очищен, так как пуст!");
        }
        if (success && numberCommand == THREE) {
            System.out.println("Книга добавлена!");
        } else if (numberCommand == THREE) {
            System.out.println("Книга не добавлена!");
        }
        if (success && numberCommand == FOUR) {
            System.out.println("Книга найдена!");
        } else if (numberCommand == FOUR) {
            System.out.println("Книга не найдена!");
        }
    }

    private void output(Bookshelf bookshelf) {
        System.out.println("В шкафу книг - " + bookshelf.getCountBooks() +
                ", свободно полок - " + bookshelf.getCountFreeShelves());
        System.out.println();
        if ((numberCommand == Bookshelf.ONE || numberCommand == THREE) && success) {
            maxLen = bookshelf.getMaxLen();
        }
        String strDash = "-".repeat(maxLen + FOUR);
        for (int i = Bookshelf.ZERO; i < Bookshelf.LEN; i++) {
            if (bookshelf.getBooks()[i] != null) {
                String strWhiteSpace = maxLen == bookshelf.getBooks()[i].getLen() ? "" :
                        " ".repeat(maxLen - bookshelf.getBooks()[i].getLen());
                System.out.println("|" + bookshelf.getBooks()[i].getAuthor() + ", " +
                        bookshelf.getBooks()[i].getName() + ", " +
                        bookshelf.getBooks()[i].getYearPublication() + strWhiteSpace + "|");
                System.out.println("|" + strDash + "|");
            }
        }
        if (bookshelf.getCountBooks() > Bookshelf.ZERO) {
            System.out.println("|" + " ".repeat(maxLen + FOUR) + "|");
        }
    }
}
