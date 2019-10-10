package labs_examples.static_nonstatic.labs;

public class NonStatic_NonStatic_DifferentClass {

    public static void main(String[] args) {

        Truck newTruck = new Truck();

        System.out.println(newTruck.truck(6) + " wheels are needed for the new trucks.");


    }
}


class Truck {

    int truck(int x){

        int trucks = x;

        Wheels truckWheels = new Wheels();

        int numWheels;

        return numWheels = trucks * truckWheels.wheels(8);

    }
}

class Wheels {

    int wheels(int y){

       return y;
    }
}
