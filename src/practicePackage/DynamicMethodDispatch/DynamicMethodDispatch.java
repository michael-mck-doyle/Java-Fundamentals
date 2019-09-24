package practicePackage.DynamicMethodDispatch;

//This is an example of Dynamic Method Dispatch or Runtime vs Compile-time Polymorphism
// Method Overloading is an example of Static (Compile-time) polymorphism
// Method Overriding is an example of Runtime polymorphism

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        Dog dog1 = new Poodle();

        dog1.bark();

        Dog dog2 = new Chihuahua();

        dog2.bark();
    }
}


class Dog {

    public void bark(){

        System.out.println("The dog barks");
    }
}

class Poodle extends Dog {

    public void bark(){
        System.out.println("The poodle barks");
    }
}

class Chihuahua extends Dog {

    public void bark(){
        System.out.println("The chihuahua barks");
    }
}

