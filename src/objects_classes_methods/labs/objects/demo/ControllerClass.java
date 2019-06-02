package objects_classes_methods.labs.objects.demo;

public class ControllerClass {

    public static void main(String[] args) {


        Folder folder1 = new Folder();
        folder1.setContents("biology");

        Folder folder2 = new Folder();
        folder2.setContents("finance");

        Backpack backpack = new Backpack();
        backpack.getFolders().add(folder1);
        backpack.getFolders().add(folder2);

        Student michael = new Student();
        michael.setName("michael");
        michael.setBackpack(backpack);

        Classroom classroom = new Classroom();
        classroom.getStudents().add(michael);


        Folder folder3 = new Folder();
        folder3.setContents("maths");

        Folder folder4 = new Folder();
        folder4.setContents("physics");

        Backpack backpack2 = new Backpack();
        backpack2.getFolders().add(folder3);
        backpack2.getFolders().add(folder4);

        Student ryan = new Student();
        ryan.setName("ryan");
        ryan.setBackpack(backpack2);


        classroom.getStudents().add(ryan);

        describeClassroom(classroom);
    }

    private static void describeClassroom(Classroom classroom) {

        System.out.println(classroom.toString());
    }
}
