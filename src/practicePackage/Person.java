package practicePackage;

 class Person {

     String name;
     int age;

     public Person(){};

     public Person(String name, int age) {

         this.name = name;
         this.age = age;

     }
 }

     class Eileen {

         public static void main(String[] args) {

             Person Eileen = new Person("Eileen", 48);

             // Eileen.age = 32;
             //Eileen.name = "Eileen";

             System.out.println(Eileen.name + " " + Eileen.age);

         }

     }



class Michael {

    public static void main(String[] args) {

        Person Michael = new Person();

        Michael.age = 48;
        Michael.name = "Michael";

        System.out.println(Michael.name + " is " + Michael.age + " years old.");
    }
}

