package labs_examples.objects_classes_methods.labs.objects.Exercise_00_PracticePackage;

public class Practice_02_Creator {


        public static void main(String[] args){
            // creates a new object of the class MyFirstConstructor
            MyFirstConstructor objectOne = new MyFirstConstructor();
            // prints out objectOne's instance variable x
            System.out.println("The value of x for objectOne is: " + objectOne.x);
            //creates a new object of the class MySecondConstructor
            MySecondConstructor objectTwo = new MySecondConstructor(15);

            // prints out objectTwo's instance variable x
            System.out.println("The value of x for objectTwo is: " + objectTwo.x);
        }
    }


