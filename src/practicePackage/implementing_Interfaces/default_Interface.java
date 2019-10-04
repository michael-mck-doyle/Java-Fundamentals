package practicePackage.implementing_Interfaces;

public interface default_Interface {

    // when classes implement an interface but cannot logically implement all of the abstract methods,
    // then it is possible to mark the optional abstract methods as 'default, which means that a default
    // behaviour will be assigned for those classes that choose not to implement the abstract method


        // interfaces only define method signatures; they have no method body

        public void temp();
        public void time();
        public void start();
        public default void stop(){

            System.out.println("Printing default message");
    }

    }




