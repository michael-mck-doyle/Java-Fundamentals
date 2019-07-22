package labs_examples.objects_classes_methods.labs.objects.exercise_03_books;

import labs_examples.packages.examples.package_01.Book;

public class booksController {

    public static void main(String[] args) {

        FictionBooks newBook1 = new FictionBooks("John McJohn", "Drama", 600);


        FictionBooks newBook2 = new FictionBooks("James mcJames","Horror");


        FictionBooks newBook3 = new FictionBooks();

        System.out.println(newBook1.author + newBook1.genre + newBook1.pages);
        System.out.println(newBook2.author + newBook2.genre);
        System.out.println(newBook3);

    }
}
