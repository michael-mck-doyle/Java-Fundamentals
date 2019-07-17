package labs_examples.objects_classes_methods.labs.objects.exercise_01_aeroplane_2;

public class Manufacturer {

    private String manufacturer;

    public Manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

