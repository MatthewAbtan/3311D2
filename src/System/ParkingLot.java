package System;

public class ParkingLot{
    private ParkingSpace[] spaces;
    private String lotName;
    private String lotAvailability;
    private boolean enabled;


    public ParkingLot(String lotName) {
        this.lotName = lotName;
        this.enabled = true;            //enabled by default
        spaces = new ParkingSpace[100]; //lots always have 100 spaces as per the assigment guidelines
    }

    public ParkingSpace[] getSpaces(){
        return spaces;
    }

    public boolean getEnabled(){
        return enabled;
    }
    public String getLotName(){
        return lotName;
    }
    //this needs the observer stuff
    public String getLotAvailability(){
        return lotAvailability;
    }

    public void setEnabled(boolean enabled){
        this.enabled = enabled;
    }
}
