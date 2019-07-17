package labs_examples.objects_classes_methods.labs.objects.exercise_01_swimmingPool;

public class Lanes {

    int numberOfLanes;

    public Lanes(int numberOfLanes) {
        this.numberOfLanes = numberOfLanes;
    }

    public int getNumberOfLanes() {
        return numberOfLanes;
    }

    public void setNumberOfLanes(int numberOfLanes) {
        this.numberOfLanes = numberOfLanes;
    }

    @Override
    public String toString() {
        return "Lanes{" +
                "numberOfLanes=" + numberOfLanes +
                '}';
    }
}
