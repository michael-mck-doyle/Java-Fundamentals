package labs_examples.objects_classes_methods.labs.objects.Exercise_00_PracticePackage;



    class Engine {
        double horsePower;  //Engine instance variable
        public Engine(double horsePower){ //Engine constructor
            this.horsePower = horsePower;
        }
    }
    class Stereo {
        String brand; // Stereo instance variable
        public Stereo(String brand){ // Steroo constructor
            this.brand = brand;
        }
    }
    class Car {
        Engine engine; // car object is creating an engine objec
        Stereo stereo; // car object is creating a stero object
        String model; // instance variable
        String color; // instance variable
        public Car(Engine engine, Stereo stereo, String model, String color){ // car constructor includes engine and stereo objects
            this.engine = engine;
            this.stereo = stereo;
            this.model = model;
            this.color = color;
        }
    }
    public class Object_Composition {
        @Override
        public String toString() {
            return "Object_Composition{}";
        }

        public static void main(String[] args){
            Engine myEngine = new Engine(800);
            Stereo myStereo = new Stereo("Sanyo");
            Car myCar = new Car(myEngine, myStereo, "BMW CX5", "White");
            System.out.println("I will get a " + myCar.color + " " + myCar.model + " with a "
                    + myCar.stereo.brand + " stereo, and a " + myCar.engine.horsePower
                    + " horse power engine");
            System.out.println(myCar);

            System.out.println(myCar.toString());

            myCar.toString();
            

        }
    }

