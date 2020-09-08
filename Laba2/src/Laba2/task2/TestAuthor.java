package Laba2.task2;

import Laba2.task2.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("J.K.Roawling", "j.k.r@dmail.com", 'f');
        Author author2 = new Author("J.Faols", "jhohnf@gmail.com", 'm');
        System.out.println("Author: " + author.toString());
        System.out.println("Author: " + author2.toString());
    }
}
