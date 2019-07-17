package labs_examples.objects_classes_methods.labs.objects.exercise_01_aeroplane_2;

public class Catering {

    private boolean meals;

    public Catering(boolean meals) {
        this.meals = meals;
    }

    public boolean isMeals() {
        return meals;
    }

    public void setMeals(boolean meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "Catering{" +
                "meals=" + meals +
                '}';
    }
}
