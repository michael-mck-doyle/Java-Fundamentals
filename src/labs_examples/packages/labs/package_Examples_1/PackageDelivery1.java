package labs_examples.packages.labs.package_Examples_1;

import labs_examples.packages.labs.package_Examples_2.PackageDelivery2;

public class PackageDelivery1 {

    int numPackages;
    String destination;

    public PackageDelivery1(int numPackages, String destination) {
        this.numPackages = numPackages;
        this.destination = destination;
    }


    public static void deliver(int numPackages, String destination){

        System.out.println(numPackages + " packages will be delivered to " + destination + " .");
    }

    protected static void receive(int numPackages){

        System.out.println("I received " + numPackages + " packages today.");
    }
}


class Package_1_controller {

    public static void main(String[] args) {

        PackageDelivery2.send("Michael");
        //PackageDelivery2.receive - because "receive" is protected it is not available as an option
        // when I try to use it from a different class which is not a sub-class
        //"send" method which is not protected is available for use in the same class
        

    }
}