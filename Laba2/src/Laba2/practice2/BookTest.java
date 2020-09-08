package Laba2.practice2;

import Laba2.practice2.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book1=new Book("J.K.Roawling","Harry Potter", 1998,"blue");
        System.out.println(book1.getAuthor()+"/"+book1.getName()+"/"+book1.getYear()+"/"+book1.getColor());
        Book book2=new Book("K.Kisi","Flew Over the Cuckoo's Nest",1962,"white");
        System.out.println(book2.getAuthor()+"/"+book2.getName()+"/"+book2.getYear()+"/"+book2.getColor());
    }
}
