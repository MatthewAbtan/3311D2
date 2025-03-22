package System;

//state design pattern
interface ParkingSpaceState{
    void book(ParkingSpace space);
    void empty(ParkingSpace space);
    void setMaintenance(ParkingSpace space);
}
class EmptyState implements ParkingSpaceState{
    @Override
    public void book(ParkingSpace space) {
        System.out.println("Parking Space Booked");
        space.setState(new OccupiedState());
    }
    @Override
    public void empty(ParkingSpace space) {
        System.out.println("Parking Space already Empty");
    }
    @Override
    public void setMaintenance(ParkingSpace space) {
        System.out.println("Parking Space set to maintenance");
    }
}
class OccupiedState implements ParkingSpaceState{
    @Override
    public void book(ParkingSpace space) {
        System.out.println("Parking Space already occupied");
    }
    @Override
    public void empty(ParkingSpace space) {
        System.out.println("Parking space is now free.");
        space.setState(new EmptyState());
    }
    @Override
    public void setMaintenance(ParkingSpace space) {
        System.out.println("Parking Space can not be set to maintenance as its already booked");
    }
}
class MaintenanceState implements ParkingSpaceState{
    @Override
    public void book(ParkingSpace space) {
        System.out.println("Parking Space can not be booked as its already under maintenance");
    }
    @Override
    public void empty(ParkingSpace space) {
        System.out.println("Parking space is now free.");
        space.setState(new EmptyState());
    }
    @Override
    public void setMaintenance(ParkingSpace space) {
        System.out.println("Parking Space already in maintenance");
    }
}
public class ParkingSpace {
    private ParkingSpaceState state;
    private int num;
    private boolean occupied;
    private boolean maintenence;
    private String currentCar;

    public ParkingSpace(int num) {
        this.num = num;
        this.occupied = false;
        this.maintenence = false;
        this.currentCar = "Space is Empty";
        this.state = new EmptyState(); //
    }
    public void setState(ParkingSpaceState state){
        this.state = state;
    }
    public void book(String car){
        state.book(this);
    }
    public void empty(){
        state.empty(this);
    }
    public void setMaintenance(){
        state.setMaintenance(this);
    }
    public String getStatus(){
        if(occupied){
            return "Space is occupied";
        }else{
            if(maintenence){
                return "Space is maintenance";
            }
            return "Space is not empty";
        }
    }
}
