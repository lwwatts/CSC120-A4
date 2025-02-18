public class Passenger implements PassengerRequirements{
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        Boolean boarded = c.addPassenger(this);
        if(!boarded){
            System.out.println("Error: Passenger " + this.name + " cannot board this car because this car is full.");
        }
        else{
            System.out.println("Passenger " + this.name + " has boarded the car.");
        }
    }

    public void getOffCar(Car c){
        Boolean gotOff = c.removePassenger(this);
        if(!gotOff){
            System.out.println("Error: Passenger " + this.name + " cannot get off this car because they are not in this car.");
        }
        else{
            System.out.println("Passenger " + this.name + " has gotten off the car.");
        }
    }

    public String getName(){
        return this.name;
    }
}
