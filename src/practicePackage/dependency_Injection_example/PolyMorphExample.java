package practicePackage.dependency_Injection_example;


class Demo{

    public static void main(String[] args) {

        Vehicle plane = new Vehicle();
        Vehicle moto = new Vehicle();
        Vehicle tractor = new Vehicle();

        PolyMorphExample morpho = new PolyMorphExample(plane);

        morpho.testVehicle();

        morpho.setMotorizedVehicle(moto);

        morpho.testVehicle();

        morpho.setMotorizedVehicle(tractor);

        morpho.testVehicle();

    }
}


public class PolyMorphExample {

    MotorizedVehicle vehicle;

    public PolyMorphExample(MotorizedVehicle vehicle){
        this.vehicle = vehicle;
    }

    public void setMotorizedVehicle(MotorizedVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void  testVehicle(){

        vehicle.start();
        vehicle.accelerate(20);
        vehicle.decelerate(15);
        vehicle.stop();
    }

}
