public class Main {
    public static void main(String[] args) {

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari",15.4,6) ;
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568,75);
        runRace(tesla);

        Car honda = new HybridCar("Honda yellow",16,8,8);
        runRace(honda);
    }

    public  static void runRace(Car car){
        System.out.println();
        car.startEngine();
        car.drive();
    }
}
