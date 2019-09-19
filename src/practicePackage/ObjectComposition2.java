package practicePackage;

public class ObjectComposition2 {


    public static void main(String[] args) {


         Seats newSeats = new Seats(4, 2);
         Drawers newDrawers = new Drawers(3);
         StudyDesk newDesk = new StudyDesk("Wood", newSeats, newDrawers );

        System.out.println("My new study desk is made from " + newDesk.madeFrom + ". It has " + newDesk.seats.sockets + " sockets and "
                + newDesk.seats.seats + " seats. It also has " + newDesk.drawers.drawers + " drawers.");

    }
}


class StudyDesk{

    String madeFrom;
    Seats seats;
    Drawers drawers;

    public StudyDesk(String madeFrom, Seats seats, Drawers drawers){

        this.madeFrom = madeFrom;
        this.seats = seats;
        this.drawers = drawers;
    }
}

class Seats{

    int seats;
    int sockets;

    public Seats(int seats, int sockets) {

        this.seats = seats;
        this.sockets = sockets;
    }
}

class Drawers {

    int drawers;

    public Drawers(int drawers){

        this.drawers = drawers;
    }
}




