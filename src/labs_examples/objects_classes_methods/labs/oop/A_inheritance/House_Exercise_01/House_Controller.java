package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;

import javax.xml.bind.SchemaOutputResolver;

public class House_Controller {


    public static void main(String[] args) {


        Blinds newBlinds = new Blinds();

        newBlinds.setBlindsColour("Green");
        newBlinds.setBlindsHeight(170);
        newBlinds.setBlindsWidth(220);
        newBlinds.setBlindsMaterial("Silk");
        newBlinds.setPriceMaterial(10);

        newBlinds.blindsCost(170, 220, 10);

        System.out.println(newBlinds.getCost());

        System.out.println(newBlinds.getBlindsColour());


    }
}
