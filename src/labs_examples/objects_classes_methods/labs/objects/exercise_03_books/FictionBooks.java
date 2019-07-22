package labs_examples.objects_classes_methods.labs.objects.exercise_03_books;

public class FictionBooks {

    String author;
    String genre;
    int pages;

    public FictionBooks(String author, String genre, int pages) {
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public FictionBooks(String author, String genre) {
        this.author = author;
        this.genre = genre;

    }

    public FictionBooks() {
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "FictionBooks{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }
}
