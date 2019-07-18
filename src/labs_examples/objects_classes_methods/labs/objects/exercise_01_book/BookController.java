package labs_examples.objects_classes_methods.labs.objects.exercise_01_book;

public class BookController {

    public static void main(String[] args) {

        Author author = new Author("John McJohn");
        Genre genre = new Genre("Horror");
        Images images = new Images(true,"Photos");
        Paper paper = new Paper(350,"natural");

        Book newBook = new Book(500,true,paper,author,genre,images);


        System.out.println(" A new book written by " + author.name + " is a " + genre.genre + " story. The book is " + newBook.pages + " pages long.");

    }
}
