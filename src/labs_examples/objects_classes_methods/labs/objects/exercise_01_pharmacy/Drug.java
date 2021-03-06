package labs_examples.objects_classes_methods.labs.objects.exercise_01_pharmacy;

public class Drug {

   private String drugName;
   private String drugStrength;
   private int drugQuantity;


    /*public Drug(String drugName, String drugStrength, int drugQuantity) {
        this.drugName = drugName;
        this.drugStrength = drugStrength;
        this.drugQuantity = drugQuantity;
    }*/

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }


    public String getDrugStrength() {
        return drugStrength;
    }

    public void setDrugStrength(String drugStrength) {
        this.drugStrength = drugStrength;
    }


    public int getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(int drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "drugName='" + drugName + '\'' +
                ", drugStrength='" + drugStrength + '\'' +
                ", drugQuantity=" + drugQuantity +
                '}';
    }
}
