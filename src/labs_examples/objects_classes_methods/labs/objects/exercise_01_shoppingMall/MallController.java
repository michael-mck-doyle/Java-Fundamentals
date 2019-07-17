package labs_examples.objects_classes_methods.labs.objects.exercise_01_shoppingMall;

public class MallController {

    public static void main(String[] args) {

        CarPark carPark = new CarPark(350, true);
        FoodCourt foodCourt = new FoodCourt(200, 15);
        Restrooms restrooms = new Restrooms(true, 3);
        Shops shops = new Shops(3, 150);
        Mall mall = new Mall(3, true, carPark, foodCourt, restrooms, shops);

        System.out.println(mall);

        System.out.println("The mall has " + mall.levels + " levels and parking with " + carPark.spaces + " parking spaces.");
    }
}
