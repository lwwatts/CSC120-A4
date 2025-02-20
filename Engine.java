public class Engine implements EngineRequirements{

    private FuelType f;
    private double maxFuelLevel;
    private double currentFuelLevel;

    public Engine(FuelType fuel, double currentFuel, double maxFuel){
        this.f = fuel;
        this.maxFuelLevel = maxFuel;
        this.currentFuelLevel = currentFuel;
    }

    public void refuel(){
        this.currentFuelLevel = maxFuelLevel;
    }

    public double getCurrentFuel(){
        return this.currentFuelLevel;
    }

    public double getMaxFuel(){
        return this.maxFuelLevel;
    }

    public FuelType getFuelType(){
        return this.f;
    }

    public Boolean go(){ 
        if (this.currentFuelLevel == 0){
            System.out.println("Error: The engine cannot run because there is no fuel remaining.");
            return false;
        }
        this.currentFuelLevel -= (this.maxFuelLevel / 4);
        System.out.println("Train is running...");
        System.out.println("Train has completed this trip.");
        System.out.println("Fuel remaining: " + this.currentFuelLevel + " out of " + this.maxFuelLevel);
        if (this.currentFuelLevel == 0){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        
    }
}