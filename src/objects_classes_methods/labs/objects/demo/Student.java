package objects_classes_methods.labs.objects.demo;

public class Student {

    private String name;
    private Backpack backpack;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", backpack=" + backpack.toString() +
                '}';
    }
}

