package labs_examples.objects_classes_methods.labs.objects.objectAssociation_Exercise2;

public class YogaStudioController {

    public static void main(String[] args) {


        Yogis jen = new Yogis("Jen", 6);

        YogaClass friday = new YogaClass("Joyce", 75, 9);

        YogaStyle ashtanga = new YogaStyle("Ashtanga");

        System.out.println(jen.name + " will attend a yoga class with " + friday.teacher + " on Friday. The class will last for "
        + friday.duration + " mins and will start at  " + friday.startTime + " am. The style of yoga " + friday.teacher + " teaches is "
        + ashtanga.yogaStyle + " .");
    }
}
