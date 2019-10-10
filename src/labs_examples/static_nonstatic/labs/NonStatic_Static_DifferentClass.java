package labs_examples.static_nonstatic.labs;


public class NonStatic_Static_DifferentClass {

    public static void main(String[] args) {

        Hotel boutique = new Hotel();

        boutique.restaurant(3);


    }
}

class Hotel {

    int x;

    void restaurant(int x){

        System.out.print("The hotel has " + x + " restaurants. ");

        Pool.pool();
    }
}

class Pool {

    static void pool(){

        System.out.println("It also has a swimming pool");
    }
}

