package labs_examples.objects_classes_methods.labs.objects.exercise_01_shoppingMall;

public class Mall {

    int levels;
    boolean parking;
    CarPark carPark;
    FoodCourt foodCourt;
    Restrooms restrooms;
    Shops shops;

    public Mall(int levels, boolean parking, CarPark carPark, FoodCourt foodCourt, Restrooms restrooms, Shops shops) {
        this.levels = levels;
        this.parking = parking;
        this.carPark = carPark;
        this.foodCourt = foodCourt;
        this.restrooms = restrooms;
        this.shops = shops;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public CarPark getCarPark() {
        return carPark;
    }

    public void setCarPark(CarPark carPark) {
        this.carPark = carPark;
    }

    public FoodCourt getFoodCourt() {
        return foodCourt;
    }

    public void setFoodCourt(FoodCourt foodCourt) {
        this.foodCourt = foodCourt;
    }

    public Restrooms getRestrooms() {
        return restrooms;
    }

    public void setRestrooms(Restrooms restrooms) {
        this.restrooms = restrooms;
    }

    public Shops getShops() {
        return shops;
    }

    public void setShops(Shops shops) {
        this.shops = shops;
    }

    @Override
    public String toString() {
        return "Mall{" +
                "levels=" + levels +
                ", parking=" + parking +
                ", carPark=" + carPark +
                ", foodCourt=" + foodCourt +
                ", restrooms=" + restrooms +
                ", shops=" + shops +
                '}';
    }
}
