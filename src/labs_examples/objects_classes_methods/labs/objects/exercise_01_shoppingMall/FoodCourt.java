package labs_examples.objects_classes_methods.labs.objects.exercise_01_shoppingMall;

public class FoodCourt {

    int seats;
    int restaurants;

    public FoodCourt(int seats, int restaurants) {
        this.seats = seats;
        this.restaurants = restaurants;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(int restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public String toString() {
        return "FoodCourt{" +
                "seats=" + seats +
                ", restaurants=" + restaurants +
                '}';
    }
}
