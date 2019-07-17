package labs_examples.objects_classes_methods.labs.objects.exercise_01_swimmingPool;

public class Pool {

    int length;
    int breadth;
    double maxDepth;

    Lifeguards lifeguards;
    DivingBoard divingBoard;
    Lanes lanes;
    StopWatch stopWatch;

    public Pool(int length, int breadth, double maxDepth, Lifeguards lifeguards, DivingBoard divingBoard, Lanes lanes, StopWatch stopWatch) {
        this.length = length;
        this.breadth = breadth;
        this.maxDepth = maxDepth;
        this.lifeguards = lifeguards;
        this.divingBoard = divingBoard;
        this.lanes = lanes;
        this.stopWatch = stopWatch;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    public Lifeguards getLifeguards() {
        return lifeguards;
    }

    public void setLifeguards(Lifeguards lifeguards) {
        this.lifeguards = lifeguards;
    }

    public DivingBoard getDivingBoard() {
        return divingBoard;
    }

    public void setDivingBoard(DivingBoard divingBoard) {
        this.divingBoard = divingBoard;
    }

    public Lanes getLanes() {
        return lanes;
    }

    public void setLanes(Lanes lanes) {
        this.lanes = lanes;
    }

    public StopWatch getStopWatch() {
        return stopWatch;
    }

    public void setStopWatch(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public String toString() {
        return "Pool{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", maxDepth=" + maxDepth +
                ", lifeguards=" + lifeguards +
                ", divingBoard=" + divingBoard +
                ", lanes=" + lanes +
                ", stopWatch=" + stopWatch +
                '}';
    }
}
