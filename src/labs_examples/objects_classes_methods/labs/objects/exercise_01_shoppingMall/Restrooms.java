package labs_examples.objects_classes_methods.labs.objects.exercise_01_shoppingMall;

public class Restrooms {

    boolean babychanging;
    int cubicles;

    public Restrooms(boolean babychanging, int cubicles) {
        this.babychanging = babychanging;
        this.cubicles = cubicles;
    }

    public boolean isBabychanging() {
        return babychanging;
    }

    public void setBabychanging(boolean babychanging) {
        this.babychanging = babychanging;
    }

    public int getCubicles() {
        return cubicles;
    }

    public void setCubicles(int cubicles) {
        this.cubicles = cubicles;
    }

    @Override
    public String toString() {
        return "Restrooms{" +
                "babychanging=" + babychanging +
                ", cubicles=" + cubicles +
                '}';
    }
}
