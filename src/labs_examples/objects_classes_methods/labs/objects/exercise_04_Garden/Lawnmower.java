package labs_examples.objects_classes_methods.labs.objects.exercise_04_Garden;

public class Lawnmower {

    String colour;
    int blades;

    public Lawnmower(String colour, int blades) {
        this.colour = colour;
        this.blades = blades;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBlades() {
        return blades;
    }

    public void setBlades(int blades) {
        this.blades = blades;
    }

    @Override
    public String toString() {
        return "Lawnmower{" +
                "colour='" + colour + '\'' +
                ", blades=" + blades +
                '}';
    }
}
