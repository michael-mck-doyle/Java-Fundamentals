package labs_examples.packages.labs.package_Examples_2;

public class PackageDelivery2 {

    String sender;
    String recipient;

    public PackageDelivery2(String sender, String recipient) {
        this.sender = sender;
        this.recipient = recipient;
    }

    public static void send(String sender){

        System.out.println(sender + " sent a parcel today.");
    }

    protected static void receive(String recipient){

        System.out.println(recipient + " received a parcel today");


    }
}
