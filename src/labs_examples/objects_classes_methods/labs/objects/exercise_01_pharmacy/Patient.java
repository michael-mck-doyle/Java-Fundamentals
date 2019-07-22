package labs_examples.objects_classes_methods.labs.objects.exercise_01_pharmacy;

import java.util.ArrayList;

public class Patient {

    private String patientName;
    private ArrayList<Prescription> prescriptions = new ArrayList<>();

    /*public Patient(String patientName, ArrayList<Prescription> prescriptions) {
        this.patientName = patientName;
        this.prescriptions = prescriptions;
    }*/

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", prescriptions=" + prescriptions +
                '}';
    }
}

