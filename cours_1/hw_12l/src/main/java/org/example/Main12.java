package org.example;

public class Main12 {
    public static void main(String[] args) {
        Book book1 = new Book("name1", 1, new Author("name1", "famaly1"));
        Book book2 = new Book("name2", 2, new Author("name2", "famaly2"));
        Book book3 = new Book("name3", 3, new Author("name3", "famaly3"));
        System.out.println(book1.getName());
        System.out.println(book2.getName());
        System.out.println(book3.getName());
    }
}
