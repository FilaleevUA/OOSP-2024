package org.example;

class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
        this.pages = builder.pages;
    }

    @Override
    public String toString() {
        return "Книга '" + title + '\'' + ", Автор '" + author + '\'' + ", Жанр '" + genre + '\'' + ", Количество страниц " + pages;
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private String genre;
        private int pages;

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}

