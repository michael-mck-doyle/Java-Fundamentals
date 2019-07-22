package labs_examples.objects_classes_methods.labs.objects.exercise_04_Garden;

public class Garden {

    int gardenArea;
    boolean hasFlowers;


    public Garden(int gardenArea, boolean hasFlowers) {
        this.gardenArea = gardenArea;
        this.hasFlowers = hasFlowers;
    }

    public int getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea;
    }

    public boolean isHasFlowers() {
        return hasFlowers;
    }

    public void setHasFlowers(boolean hasFlowers) {
        this.hasFlowers = hasFlowers;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "gardenArea=" + gardenArea +
                ", hasFlowers=" + hasFlowers +
                '}';
    }
}
