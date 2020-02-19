package labs_examples.objects_classes_methods.labs.objects.Exercise_00_PracticePackage;

public class Name_Age_Height_Constructor {

        public static void main(String[] args) {

            // please write a custom constructor in the Person class
            // as directed below (in the Person class)

            // now use that new constructor to create two unique Person objects
            scottishPerson Michael = new scottishPerson(48, "Michael");
            scottishPerson Imogen = new scottishPerson(11, "Imogen", 150);
            // now print the instance var values of each object

            System.out.println(Michael.name + " is " + Michael.age + " years old.");
            System.out.println(Imogen.name + " is " + Imogen.age + " years old. She is " + Imogen.height + " cm tall.");
        }
    }

    class scottishPerson {

        String name;
        int age;
        int height;

        // please create a fully qualified constructor
        // (which is a constructor that takes in "name" and "age")
        // and set the instance variables above from within the constructor
        scottishPerson(int age, String name) {
            this.age = age;
            this.name = name;
        }
        scottishPerson(int age, String name, int height) {
            this.age = age;
            this.name = name;
            this.height = height;
        }
    }

