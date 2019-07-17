package labs_examples.objects_classes_methods.labs.objects.exercise_01_shoppingMall;

public class Shops {

    int levels;
    int stores;

    public Shops(int levels, int stores) {
        this.levels = levels;
        this.stores = stores;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getStores() {
        return stores;
    }

    public void setStores(int stores) {
        this.stores = stores;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "levels=" + levels +
                ", stores=" + stores +
                '}';
    }
}
