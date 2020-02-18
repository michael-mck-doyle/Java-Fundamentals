package labs_examples.objects_classes_methods.labs.objects.Exercise_00_PracticePackage;

public class Practice_01 {


        public static void main(String[] args) {
            // please demonstrate how to create two unique Object
            // of the Person class below

            Person Lara = new Person();
            Person John = new Person();
            // please demontsrate how to set the object's instance vars

            Lara.name = ("Lara");
            Lara.age = (23);

            John.name = ("John");
            John.age = (33);

            // please print out the name and age of both Person objects
            // using the object to get the values
            System.out.println(Lara.name + " is " + Lara.age + " years old." );
            System.out.println(John.name + " is " + John.age + " years old." );
        }
    }



