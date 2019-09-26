package practicePackage.Inheritance;

public class Business_Constructor_Inheritance {

    public static void main(String[] args) {

    Store newStore = new Store(3,"Marine Parade");

        System.out.println("Employees = " + newStore.employees);
        System.out.println("Location is " + newStore.location);


        OfficeSupplies StationaryStore = new OfficeSupplies(5,"Pasir Ris",500,50);

        System.out.println("The new stationary store is located in " + StationaryStore.location);
        System.out.println("It currently stocks " + StationaryStore.pencils + " pencils and " + StationaryStore.printers
        + " printers.");


        PrintingService newCopyJob = new PrintingService(2,"Badok",300,2,3);


        System.out.println(newCopyJob.copyCost);
    }

}




class Store {

    int employees;
    String location;

    public Store(){

    }

    public Store (int employees, String location){

        this.employees = employees;
        this.location = location;

    }


}


class OfficeSupplies extends Store{

    int pencils;
    int printers;

    public OfficeSupplies(int employees,String location, int pencils,int printers){
        super(employees, location);
        this.pencils = pencils;
        this.printers = printers;

    }
}

class PrintingService extends OfficeSupplies {

    int copyCost;

    public PrintingService(int employees, String location, int pencils, int printers, int copyCost){

        super(employees,location,pencils,printers);
        this.copyCost = copyCost;
    }
}