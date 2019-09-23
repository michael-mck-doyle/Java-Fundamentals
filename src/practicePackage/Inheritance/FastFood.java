package practicePackage.Inheritance;

public class FastFood extends Restaurant {


    int waitingTime;
    int counters;

    public FastFood(){

    }

    public FastFood(int capacity, String name, int waitingTime, int counters ){

        super(capacity, name);
        this.waitingTime = waitingTime;
        this.counters = counters;

    }

    @Override
    public String toString() {
        return "FastFood{" +
                "waitingTime=" + waitingTime +
                ", counters=" + counters +
                '}';
    }
}
