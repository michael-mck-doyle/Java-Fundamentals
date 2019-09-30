package practicePackage.super_Keyword;

public class superKeyword_Constructors_Inheritance {

    public static void main(String[] args) {

        Motorcycle bike = new Motorcycle(50,2000,"Benelli",5000);

        System.out.println(bike.toString());

    }

}

class Vehicle{

    int mpg;
    int fuel_capacity;
    String type;

    public Vehicle(int mpg, int fuel_capacity, String type){

        this.mpg = mpg;
        this.fuel_capacity = fuel_capacity;
        this.type = type;
    }
}

class Motorcycle extends Vehicle{

    int cubicLiters;

    public Motorcycle(int mpg, int fuel_capacity, String type, int cubicLiters) {
        super(mpg, fuel_capacity, type);
        this.cubicLiters = cubicLiters;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "mpg=" + mpg +
                ", fuel_capacity=" + fuel_capacity +
                ", type='" + type + '\'' +
                ", cubicLiters=" + cubicLiters +
                '}';
    }
}