package labs_examples.objects_classes_methods.labs.objects.aeroplaneExercise_1;

import java.util.ArrayList;

public class Luggage {

    private int weight;
    private String colour;

    private ArrayList<Gift> gifts = new ArrayList();


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public ArrayList<Gift> getGifts() {
        return gifts;
    }

    public void setGifts(ArrayList<Gift> gifts) {
        this.gifts = gifts;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Gift g : gifts) {
            sb.append(g.toString());
        }
        return "Luggage{" +
                "weight=" + weight +
                ", colour='" + colour + '\'' +
                ", gifts=" + sb.toString() +
                '}';
    }
}
