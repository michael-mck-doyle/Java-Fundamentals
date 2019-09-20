package practicePackage;

import java.sql.SQLOutput;

public class GetterSetterObjectComposition {

    public static void main(String[] args) {


        Players players = new Players(11, 4, 2);
        Strip teamStrip = new Strip("Green & White", 40);
        Stadium parkhead = new Stadium(50000, "Paradise");
        SoccerTeam celtic = new SoccerTeam(players, teamStrip, parkhead, "Lennon", "Glasgow", 100);

        System.out.println("My team Celtic usually plays with " + players.getDefenders() + " defenders and "
                + players.getStrikers() + " strikers.");

        System.out.println("The stadium they play at is called " + parkhead.getName() + ". It has a capacity of "
                + parkhead.getSeats() + " seats.");

        System.out.println("The team play in a " + teamStrip.getColour() + " strip. It costs "
                + teamStrip.getPrice() + " dollars to buy.");

        System.out.println(celtic.getManager() + " is the manager of Celtic." + celtic.getLocation() +
                " is where the team come from.");

        System.out.println(celtic.getStadium().getName() + " is the name of the stadium they play at." +
                " It has " + celtic.getStadium().getSeats() + " seats.");


        teamStrip.setColour("Green & Gold");

        System.out.println("The team play in a " + teamStrip.getColour() + " strip. It costs "
                + teamStrip.getPrice() + " dollars to buy.");

        celtic.setManager("Larson");

        System.out.println(celtic.getManager() + " is the manager of Celtic." + celtic.getLocation() +
                " is where the team come from.");

    }


}



class SoccerTeam {

    private Players players;
    private Strip strip;
    private Stadium stadium;
    private String manager;
    private String location;
    private int trophies;

    public SoccerTeam(Players players, Strip strip, Stadium stadium, String manager, String location, int trophies){

        this.players = players;
        this.strip = strip;
        this.stadium = stadium;
        this.manager = manager;
        this.location = location;
        this.trophies = trophies;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    public Strip getStrip() {
        return strip;
    }

    public void setStrip(Strip strip) {
        this.strip = strip;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
}

class Players {

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getDefenders() {
        return defenders;
    }

    public void setDefenders(int defenders) {
        this.defenders = defenders;
    }

    public int getStrikers() {
        return strikers;
    }

    public void setStrikers(int strikers) {
        this.strikers = strikers;
    }

    private int players;
    private int defenders;
    private int strikers;

    public Players(int players, int defenders, int strikers){
        this.players = players;
        this.defenders = defenders;
        this.strikers = strikers;
    }



}

class Strip {

    private String colour;
    private int price;

    public Strip(String colour, int price){
        this.colour = colour;
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Stadium {

    private int seats;
    private String name;

    public Stadium(int seats, String name){
        this.seats = seats;
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



