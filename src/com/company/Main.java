package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book>bookList=new ArrayList<>();
        Map<String,String> newList=new LinkedHashMap<>();

        Book b1 = new Book("War and Peace", 100, "Tolstoy", 1866);
        Book b2 = new Book("Les Miserables", 200, "	Victor Hugo", 1862);
        Book b3 = new Book("The Count of Monte Cristo", 300, " Alexandre Dumas pere", 1844);
        Book b4 = new Book("Kürk Mantolu Madonna", 400, "Sabahattin Ali", 1943);
        Book b5 = new Book("Puslu Kıtalar Atlası", 500, "İhsan Oktay Anar", 1995);
        Book b6 = new Book("Book-6", 245, "Author-6", 2003);
        Book b7 = new Book("Book-7", 88, "Author-7", 1985);
        Book b8 = new Book("Book-8", 149, "Author-8", 2022);
        Book b9 = new Book("Book-9", 66, "Author-9", 2003);
        Book b10 = new Book("Book-10", 191, "Author-10", 2014);

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);
        bookList.add(b7);
        bookList.add(b8);
        bookList.add(b9);
        bookList.add(b10);
        System.out.println();
        System.out.println("------------------------");
        bookList.stream().forEach(i->{
            newList.put(i.getName(),i.getAuthor());

        });
        for (String k:newList.keySet()){
            System.out.println(k+" --- "+newList.get(k));
        }
        System.out.println();
        System.out.println("BOOKS OVER 100 PAGE");
        System.out.println("-------------------");

        ArrayList<Book>books=new ArrayList<>();
        bookList.stream().filter(i-> i.getPage()>100).forEach(i-> {
            books.add(i);
        });
        books.stream().forEach(i->{
            System.out.println(i.getName()+" --- "+ i.getPage());
        });
    }

}
