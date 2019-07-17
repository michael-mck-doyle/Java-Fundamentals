package labs_examples.objects_classes_methods.labs.objects.exercise_01_swimmingPool;

public class PoolController {

    public static void main(String[] args) {


        DivingBoard divingBoard = new DivingBoard(true, 10.0);
        Lanes lanes = new Lanes(8);
        Lifeguards lifeguards = new Lifeguards(5, "Red");
        StopWatch stopwatch = new StopWatch(true);

        Pool pool = new Pool(100, 40, 4.5, lifeguards, divingBoard, lanes, stopwatch);

        System.out.println("The new pool has a diving board (? " + divingBoard.hasDivingBoard + ") which is " + divingBoard.height + " metres tall.");


    }
}
