package labs_examples.objects_classes_methods.labs.objects.exercise_01_book;

public class Book {


    int pages;
    boolean largePrint;

    Paper paper;
    Author author;
    Genre genre;
    Images images;

    public Book(int pages, boolean largePrint, Paper paper, Author author, Genre genre, Images images) {
        this.pages = pages;
        this.largePrint = largePrint;
        this.paper = paper;
        this.author = author;
        this.genre = genre;
        this.images = images;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isLargePrint() {
        return largePrint;
    }

    public void setLargePrint(boolean largePrint) {
        this.largePrint = largePrint;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", largePrint=" + largePrint +
                ", paper=" + paper +
                ", author=" + author +
                ", genre=" + genre +
                ", images=" + images +
                '}';
    }
}
