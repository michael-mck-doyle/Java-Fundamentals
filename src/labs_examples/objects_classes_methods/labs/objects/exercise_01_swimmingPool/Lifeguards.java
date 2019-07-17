package labs_examples.objects_classes_methods.labs.objects.exercise_01_swimmingPool;

public class Lifeguards {

    int lifeguardsOnDuty;
    String uniformColour;

    public Lifeguards(int lifeguardsOnDuty, String uniformColour) {
        this.lifeguardsOnDuty = lifeguardsOnDuty;
        this.uniformColour = uniformColour;
    }

    public int getLifeguardsOnDuty() {
        return lifeguardsOnDuty;
    }

    public void setLifeguardsOnDuty(int lifeguardsOnDuty) {
        this.lifeguardsOnDuty = lifeguardsOnDuty;
    }

    public String getUniformColour() {
        return uniformColour;
    }

    public void setUniformColour(String uniformColour) {
        this.uniformColour = uniformColour;
    }

    @Override
    public String toString() {
        return "Lifeguards{" +
                "lifeguardsOnDuty=" + lifeguardsOnDuty +
                ", uniformColour='" + uniformColour + '\'' +
                '}';
    }
}
