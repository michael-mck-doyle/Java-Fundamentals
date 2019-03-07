package objects_classes_methods.labs.objects.demo;

public class Folder {

    private String contents;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "contents='" + contents + '\'' +
                '}';
    }
}
