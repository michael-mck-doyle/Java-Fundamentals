package practicePackage;

public class ObjectAssociation {

AnotherPerson Michael = new AnotherPerson("Michael");

Course Java = new Course("Java");


}


class AnotherPerson {

    String name;
    public AnotherPerson (String name) {

        this.name = name;
    }
}


class Course {

    String course;
    public Course (String course) {

        this.course = course;
    }
}