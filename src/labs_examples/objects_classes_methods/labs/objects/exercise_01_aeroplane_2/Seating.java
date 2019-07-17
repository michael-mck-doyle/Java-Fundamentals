package labs_examples.objects_classes_methods.labs.objects.exercise_01_aeroplane_2;

public class Seating {

    private boolean reclines;
    private int seat;

    public Seating(boolean reclines, int seat) {
        this.reclines = reclines;
        this.seat = seat;
    }


    public boolean isReclines() {
        return reclines;
    }

    public void setReclines(boolean reclines) {
        this.reclines = reclines;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Seating{" +
                "reclines=" + reclines +
                ", seat=" + seat +
                '}';
    }
}
