package labs_examples.static_nonstatic.labs;

public class Static_Static_SameClass2 {


    int distance = 800;

    public Static_Static_SameClass2(int distance) {
    }

    static void run() {

        System.out.println("The boy ran");
        distance(1000);
        System.out.print("metres");
    }

    static void distance(int distance) {
        System.out.println(distance);
    }

    public static void main(String[] args) {

        run();
        //distance(500);
    }
}
