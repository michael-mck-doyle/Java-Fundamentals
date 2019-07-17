package labs_examples.objects_classes_methods.labs.objects.exercise_01_swimmingPool;

public class DivingBoard {

    boolean hasDivingBoard;
    double height;

    public DivingBoard(boolean hasDivingBoard, double height) {
        this.hasDivingBoard = hasDivingBoard;
        this.height = height;
    }

    public boolean isHasDivingBoard() {
        return hasDivingBoard;
    }

    public void setHasDivingBoard(boolean hasDivingBoard) {
        this.hasDivingBoard = hasDivingBoard;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "DivingBoard{" +
                "hasDivingBoard=" + hasDivingBoard +
                ", height=" + height +
                '}';
    }
}
