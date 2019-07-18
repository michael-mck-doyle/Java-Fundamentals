package labs_examples.objects_classes_methods.labs.objects.exercise_02_book;

public class BookController {

    public static void main(String[] args) {

        Author author = new Author("John McJohn");
        Pages pages = new Pages(500);
        Genre genre = new Genre("Horror");


        System.out.println("New author, " + author.name + ", has written a " + genre.genre + " story which is " + pages.pages +
                 " pages long.");


    }
}
