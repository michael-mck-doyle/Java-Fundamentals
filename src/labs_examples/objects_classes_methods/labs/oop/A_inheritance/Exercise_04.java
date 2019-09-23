package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Exercise_04 {


    public static void main(String[] args) {
            Parent c = new Child();
            c.doSomething();
        }

    }


    class Parent {

        public void doSomething() {
            System.err.println("Parent called");
        }
    }

    class Child extends Parent {

        public void doSomething() {
            System.err.println("Child called");
        }
    }

