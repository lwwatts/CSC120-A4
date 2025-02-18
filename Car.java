import java.util.ArrayList;
import java.util.Iterator;

public class Car implements CarRequirements{

    private int maxCapacity;
    private ArrayList<Passenger> passengersOnBoard;

    public Car(int cap){
        this.maxCapacity = cap;
        this.passengersOnBoard = new ArrayList<Passenger>();
    }

    public int getCapacity(){
        return this.maxCapacity;
    }

    public int seatsRemaining(){
        int seatsFull = this.passengersOnBoard.size();
        return (this.maxCapacity - seatsFull);
    }

    public Boolean addPassenger(Passenger p){
        if(this.seatsRemaining() != 0 && !this.passengersOnBoard.contains(p)){
            this.passengersOnBoard.add(p);
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public Boolean removePassenger(Passenger p){
        if(this.passengersOnBoard.contains(p)){
            this.passengersOnBoard.remove(p);
            return true;
        }
        else{
            return false;
        }

    }

    public void printManifest(){
        if(this.passengersOnBoard.size() != 0){
            Iterator<Passenger> i = passengersOnBoard.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
        }
        else{
            System.out.println("This car is EMPTY.");
        }
    }

}