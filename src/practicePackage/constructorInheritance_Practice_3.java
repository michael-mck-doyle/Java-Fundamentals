package practicePackage;

public class constructorInheritance_Practice_3 {

    public void main(String[] args) {

        //custom constructor
        Gourmet fancy = new Gourmet(100, 24, "italian", 15);

        //default constructor
        Gourmet evenFancier = new Gourmet();


        System.out.println(fancy.toString());
        System.out.println(evenFancier.toString());
    }


}

// superclass

class Restaurant {

    private int area;
    private int capacity;
    private String style;

    //default constructor
    public Restaurant () {
        area = 0;
        capacity = 0;
        style = "";

    }

    public Restaurant(int area, int capacity, String style) {

        this.area = area;
        this.capacity = capacity;
        this.style = style;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "area=" + area +
                ", capacity=" + capacity +
                ", style='" + style + '\'' +
                '}';
    }
}

// subclass
class Gourmet extends Restaurant {

    private int waitTime;

    //default constructor
    public Gourmet() {
        super();
        waitTime = 0;
    }

    //constructor
    public Gourmet(int area, int capacity, String style, int waitTime) {

        super(area, capacity, style);
        this.waitTime = waitTime;

    }

    @Override
    public String toString() {
        return "Gourmet{" +
                "waitTime=" + waitTime +
                '}';
    }

}

