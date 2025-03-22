package System;

import java.util.ArrayList;

//maybe treat this as a facade design pattern
public class MainSystem {
    private static MainSystem instance;
    private ArrayList<ParkingLot> lots = new ArrayList<>();
    private ArrayList<User> approvedUsers = new ArrayList<>();
    private ArrayList<User> pendingUsers = new ArrayList<>();
    private UserFactory userFactory = new UserFactory();
    private MainSystem(){
        //will load lots from a file after, this is temporary
        lots.add(new ParkingLot("Lot1"));
        lots.add(new ParkingLot("Lot2"));
        lots.add(new ParkingLot("Lot3"));
    }

    public static MainSystem getInstance(){
        if(instance == null){
            instance = new MainSystem();
        }
        return instance;
    }
    public ArrayList<ParkingLot> getLots(){
        return lots;
    }

    public void registerAccount(String type,String username, String password){
        if (type.equals("Visitor")) { //visitor approved by default
            approvedUsers.add(userFactory.createUser(type, username, password));
        } else {
            pendingUsers.add(userFactory.createUser(type, username, password));
        }
    }
}
