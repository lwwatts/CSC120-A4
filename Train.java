import java.util.ArrayList;
import java.util.Iterator;

public class Train implements TrainRequirements{

    Engine engine;
    ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i ++){
            Car c = new Car(passengerCapacity);
            cars.add(c);
        }
    }
    
    public Engine getEngine(){
        return this.engine;
    }

    public Car getCar(int i){
        return this.cars.get(i);
    }

    public int getMaxCapacity(){
        int capacity = 0;
        Iterator<Car> iter = this.cars.iterator();
        while(iter.hasNext()){
            Car c = iter.next();
            capacity += c.getCapacity();
        }
        return capacity;
    }
    
    public int seatsRemaining(){
        int seatsLeft = 0;
        Iterator<Car> iter = this.cars.iterator();
        while(iter.hasNext()){
            Car c = iter.next();
            seatsLeft += c.seatsRemaining();
        }
        return seatsLeft;
    }

    public void printManifest(){
        Iterator<Car> iter = this.cars.iterator();
        int count = 0;
        while(iter.hasNext()){
            System.out.println("Car " + count + " Passengers: ");
            count += 1;
            Car c = iter.next();
            c.printManifest();
        }
    }
}
