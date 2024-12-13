package org.example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book.BookBuilder()
                .setTitle("Война и мир")
                .setAuthor("Лев Толстой")
                .setGenre("Роман")
                .setPages(1225)
                .build();

        Book book2 = new Book.BookBuilder()
                .setTitle("1984")
                .setAuthor("Джордж Оруэлл")
                .setGenre("Антиутопия")
                .setPages(328)
                .build();

        System.out.println(book1);
        System.out.println(book2);
    }
}