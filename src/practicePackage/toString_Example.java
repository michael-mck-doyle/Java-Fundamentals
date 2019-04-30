package practicePackage;

public class toString_Example {

    public static void main(String[] args) {


        Child boy = new Child("JOhn", 8, "blue", 90);

        System.out.println(boy.toString());
    }
}


    class Parent {

        public String name;
        public int age;

        public Parent(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Parent{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    class Child extends Parent {

        public String eyeColour;
        public int height;

        public Child(String name, int age, String eyeColour, int height) {
            super(name, age);
            this.eyeColour = eyeColour;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Child{" +
                    "eyeColour='" + eyeColour + '\'' +
                    ", height=" + height +
                    super.toString() + // the parent class details were manually added in order for the toString to print out all the object details
                    '}';
        }
    }



