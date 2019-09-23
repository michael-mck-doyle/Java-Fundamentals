package practicePackage.Inheritance;

public class Restaurant_Constructor_Inheritance {

    public static void main(String[] args) {

        FastFood burgerJoint = new FastFood(50,"Bills Burgers",5,8);

        System.out.println(burgerJoint.toString());

        FastFood chickenJoint = new FastFood();

    }
}
