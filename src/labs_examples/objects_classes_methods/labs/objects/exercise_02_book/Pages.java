package labs_examples.objects_classes_methods.labs.objects.exercise_02_book;

public class Pages {

    int pages;

    public Pages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Pages{" +
                "pages=" + pages +
                '}';
    }
}
