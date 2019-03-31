package labs_examples.objects_classes_methods.labs.objects.objectComposition_Practice1;

import java.util.ArrayList;

public class Patient {

    String name;
    private ArrayList<Prescription> prescriptions = new ArrayList<>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Prescription p : prescriptions) {
            sb.append(p.toString());
        }
        return "Patient{" +
                "name='" + name + '\'' +
                ", prescriptions=" + prescriptions +
                '}';
    }
}
