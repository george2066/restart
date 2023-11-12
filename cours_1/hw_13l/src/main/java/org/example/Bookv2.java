package org.example;

public class Bookv2 {
    private String name;
    private int year;
    private Author author;

    public Bookv2(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
