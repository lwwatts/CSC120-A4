public class Passenger implements PassengerRequirements{
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        Boolean boarded = c.addPassenger(this);
        if(!boarded){
            System.out.println("Error: Passenger cannot board this car because this car is full.");
        }
    }

    public void getOffCar(Car c){
        Boolean gotOff = c.removePassenger(this);
        if(!gotOff){
            System.out.println("Error: Passenger cannot get off this car because the passenger is not in this car.");
        }
    }

    public String getName(){
        return this.name;
    }
}
