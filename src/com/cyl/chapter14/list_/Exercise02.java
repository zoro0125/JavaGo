package com.cyl.chapter14.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cyl
 * @version 1.0
 */

public class Exercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("book1", 12, "xiaoming"));
        list.add(new Book("book2", 34.5, "ifd"));
        list.add(new Book("book3", 3532, "invs"));
        list.add(new Book("book4", 23.6, "fefvs"));

        System.out.println(list);
        sort(list);
        System.out.println(list);

    }
    public static void sort(List list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}

class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }


}
