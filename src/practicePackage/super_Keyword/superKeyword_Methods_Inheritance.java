package practicePackage.super_Keyword;

class superKeyword_Practice {

    public static void main(String[] args) {

        Sublass newSubclass = new Sublass();
        newSubclass.printMethod();
        System.out.println();
        newSubclass.someOtherMethod();

    }

}


//Calling Overridden Parent Method from Child class




class Superclass {

    public void printMethod(){
        System.out.println("Printed in Superclass");
    }
}


class Sublass extends Superclass{

    @Override
    public void printMethod() {
        System.out.println("Printed in Subclass");
    }

    public void someOtherMethod() {
        super.printMethod();
        this.printMethod();
    }
}

