package objects_classes_methods.labs.objects.demo;

import java.util.ArrayList;

public class Backpack {

    private int capacity;
    private String colour;
    private ArrayList<Folder> folders = new ArrayList<>();

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Folder f : folders) {
            sb.append(f.toString());
        }

        return "Backpack{" +
                "capacity=" + capacity +
                ", colour='" + colour + '\'' +
                ", folders=" + sb.toString() +
                '}';
    }
}
