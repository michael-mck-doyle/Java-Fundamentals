package practicePackage.finalKeyword_Practice;

public class Final_Keyword_Practice {

    public static void main(String[] args) {


        final_Calendar daystoChristmas = new final_Calendar(365, 321);

        int x = daystoChristmas.daysRemaining(300,321);
        System.out.println(x + " days remaining to Christmas!");
    }
}



class final_Calendar {

    public final int DAYSYEAR = 365;
    public int daysPassed;


    public final_Calendar(int daysYear, int daysPassed) {

        this.daysPassed = daysPassed;
    }

    public int daysRemaining (int daysYear, int daysPassed) {

        int daysRemaining;
        return daysRemaining = daysYear - daysPassed;
    }

}


