package labs_examples.objects_classes_methods.labs.objects.exercise_04_Garden;

public class Sprinkler {

        boolean sprinklerOn;
        int waterDistance;


    public Sprinkler(boolean sprinklerOn, int waterDistance) {
        this.sprinklerOn = sprinklerOn;
        this.waterDistance = waterDistance;
    }

    public boolean isSprinklerOn() {
        return sprinklerOn;
    }

    public void setSprinklerOn(boolean sprinklerOn) {
        this.sprinklerOn = sprinklerOn;
    }

    public int getWaterDistance() {
        return waterDistance;
    }

    public void setWaterDistance(int waterDistance) {
        this.waterDistance = waterDistance;
    }

    @Override
    public String toString() {
        return "Sprinkler{" +
                "sprinklerOn=" + sprinklerOn +
                ", waterDistance=" + waterDistance +
                '}';
    }
}
