package labs_examples.objects_classes_methods.labs.objects.exercise_01_aeroplane;

public class Passenger {

    private String name;
    private Luggage luggage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", luggage=" + luggage.toString() +
                '}';
    }
}
