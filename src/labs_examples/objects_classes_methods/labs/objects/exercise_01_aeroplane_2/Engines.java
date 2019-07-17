package labs_examples.objects_classes_methods.labs.objects.exercise_01_aeroplane_2;

public class Engines {

    private boolean jetEngine;

    public Engines(boolean jetEngine) {
        this.jetEngine = jetEngine;
    }

    public boolean isJetEngine() {
        return jetEngine;
    }

    public void setJetEngine(boolean jetEngine) {
        this.jetEngine = jetEngine;
    }

    @Override
    public String toString() {
        return "Engines{" +
                "jetEngine=" + jetEngine +
                '}';
    }
}
