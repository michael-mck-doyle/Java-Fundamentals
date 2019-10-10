package labs_examples.static_nonstatic.labs;

public class NonStatic_NonStatic_SameClass {


    // nonStatic method 1

    void theatreSeatsAvailable(int x){

        System.out.print("There are ");

        System.out.print(x - ticketsSold(368));

        System.out.print(" vacant seats available for the next performance.");
    }


    // nonStatic method 2

    int ticketsSold(int y){

        return y;
    }



    public static void main(String[] args) {

        NonStatic_NonStatic_SameClass availableSeats = new NonStatic_NonStatic_SameClass();


        availableSeats.theatreSeatsAvailable(500);
    }



}
