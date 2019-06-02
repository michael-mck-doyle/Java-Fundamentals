package labs_examples.objects_classes_methods.labs.objects.objectComposition_Practice1;

import java.util.ArrayList;

public class Prescription {

    private String doctorName;
    private ArrayList<Drug> drugs = new ArrayList<>();

    /*public Prescription(String doctorName, ArrayList<Drug> drugs) {
        this.doctorName = doctorName;
        this.drugs = drugs;
    }*/

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<Drug> drugs) {
        this.drugs = drugs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Drug d : drugs) {
            sb.append(d.toString());
        }

        return "Prescription{" +
                "doctorName='" + doctorName + '\'' +
                ", drugs=" + sb.toString() +
                '}';
    }
}
