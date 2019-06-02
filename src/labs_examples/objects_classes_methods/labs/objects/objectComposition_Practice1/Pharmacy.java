package labs_examples.objects_classes_methods.labs.objects.objectComposition_Practice1;

import java.util.ArrayList;

public class Pharmacy {

    private ArrayList<Patient> patients = new ArrayList<>();

    /*public Pharmacy(ArrayList<Patient> patients) {
        this.patients = patients;
    }*/

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Patient p : patients) {
            sb.append(p.toString());
        }
        return "Pharmacy{" +
                "patients=" + patients +
                '}';
    }
}
