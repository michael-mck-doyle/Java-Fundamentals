package labs_examples.objects_classes_methods.labs.objects.exercise_01_pharmacy;

public class Pharmacy_Controller {


    public static void main(String[] args) {


            Drug painkiller = new Drug();
            painkiller.setDrugName("Aspirin");
            painkiller.setDrugQuantity(24);
            painkiller.setDrugStrength("300g");


            Drug antiBiotic = new Drug();
            antiBiotic.setDrugName("Tetracycline");
            antiBiotic.setDrugQuantity(14);
            antiBiotic.setDrugStrength("250mg");


            Drug diabetesDrug = new Drug();
            diabetesDrug.setDrugName("Metformin");
            diabetesDrug.setDrugQuantity(60);
            diabetesDrug.setDrugStrength("500mg");

            Drug antiCholesterol = new Drug();
            antiCholesterol.setDrugName("Simvastatin");
            antiCholesterol.setDrugQuantity(24);
            antiCholesterol.setDrugStrength("150mg");

            Drug antiAlcohol = new Drug();
            antiAlcohol.setDrugName("Disulfirma");
            antiAlcohol.setDrugQuantity(30);
            antiAlcohol.setDrugStrength("200mg");


            Prescription prescription1 = new Prescription();
            prescription1.setDoctorName("Dr Robertson");
            prescription1.getDrugs().add(painkiller);
            prescription1.getDrugs().add(antiBiotic);
            prescription1.getDrugs().add(diabetesDrug);

            Prescription prescription2 = new Prescription();
            prescription2.setDoctorName("Dr Palmer");
            prescription2.getDrugs().add(antiCholesterol);
            prescription2.getDrugs().add(antiAlcohol);


            Patient mrsSantos = new Patient();
            mrsSantos.setPatientName("Mrs Santos");
            mrsSantos.getPrescriptions().add(prescription1);

            Patient mrHoward = new Patient();
            mrHoward.setPatientName("Mr Howard");
            mrHoward.getPrescriptions().add(prescription2);



            Pharmacy goodDrugsPharmacy = new Pharmacy();
            goodDrugsPharmacy.getPatients().add(mrsSantos);
            goodDrugsPharmacy.getPatients().add(mrHoward);


            System.out.println();

            describePharmacy(goodDrugsPharmacy);

            System.out.println();

            System.out.println(prescription1.toString());

            System.out.println();

            System.out.println(mrHoward.toString());

            System.out.println();

            System.out.println(prescription2.toString());

            System.out.println();

            System.out.println(antiBiotic.toString());



            }

        private static void describePharmacy(Pharmacy goodDrugsPharmacy) {

                System.out.println(goodDrugsPharmacy.toString());
        }



        }



