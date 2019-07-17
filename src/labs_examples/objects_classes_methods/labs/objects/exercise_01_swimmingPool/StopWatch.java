package labs_examples.objects_classes_methods.labs.objects.exercise_01_swimmingPool;

public class StopWatch {

    boolean digital;

    public StopWatch(boolean digital) {
        this.digital = digital;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "digital=" + digital +
                '}';
    }
}
