package labs_examples.static_nonstatic.labs;

public class Static_NonStatic_DifferentClass {

    public static void main(String[] args) {


    Americano.americanoOrder();


    }

}



class Coffee {

    public void coffeeOrder() {

        System.out.println("Many customers order coffee.");
    }
}

class Americano {

    public static void americanoOrder() {

        Coffee hotCoffee = new Coffee();
        hotCoffee.coffeeOrder();

        System.out.println("Americano is the most popular.");
    }
}