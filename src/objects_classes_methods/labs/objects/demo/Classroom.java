package objects_classes_methods.labs.objects.demo;

import java.util.ArrayList;

public class Classroom {

    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student f : students) {
            sb.append(f.toString());
        }
        return "Classroom{" +
                "students=" + students +
                '}';
    }
}

