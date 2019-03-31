package labs_examples.objects_classes_methods.labs.objects.objectComposition_Practice1;

public class Pharmacy_Controller {


    public static void main(String[] args) {


            Drug painkiller = new Drug();
            painkiller.setDrugName("Aspirin");
            painkiller.setDrugQuantity(24);
            painkiller.setDrugStrength("300g");


            Drug antiBiotic = new Drug();
            antiBiotic.setDrugName("Tetracycline");
            antiBiotic.setDrugQuantity(14);
            antiBiotic.setDrugStrength("250mg");


            Drug diabetesDrug = new Drug();
            diabetesDrug.setDrugName("Metformin");
            diabetesDrug.setDrugQuantity(60);
            diabetesDrug.setDrugStrength("500mg");



            Prescription prescription1 = new Prescription();





    }
}
