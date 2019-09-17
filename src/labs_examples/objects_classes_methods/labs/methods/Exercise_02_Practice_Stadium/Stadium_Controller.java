package labs_examples.objects_classes_methods.labs.methods.Exercise_02_Practice_Stadium;

public class Stadium_Controller {

    public static void main(String[] args) {

        Stadium stadium = new Stadium();
        stadium.name = "Celtic Park";
        stadium.seats = 55000;

        System.out.println("The match at " + stadium.name + " has a capacity of " + stadium.seats + " seats");


    }
}
