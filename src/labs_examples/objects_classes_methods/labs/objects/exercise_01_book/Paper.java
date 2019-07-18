package labs_examples.objects_classes_methods.labs.objects.exercise_01_book;

public class Paper {

    int size;
    String finish;


    Paper(int size, String finish) {
        this.size = size;
        this.finish = finish;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "size=" + size +
                ", finish='" + finish + '\'' +
                '}';
    }
}
