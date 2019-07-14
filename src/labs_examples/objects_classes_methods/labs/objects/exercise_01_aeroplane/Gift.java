package labs_examples.objects_classes_methods.labs.objects.exercise_01_aeroplane;

public class Gift {

    private String contents;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "contents='" + contents + '\'' +
                '}';
    }


}
