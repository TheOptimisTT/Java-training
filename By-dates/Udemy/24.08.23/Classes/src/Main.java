public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        //car.describeCar();

        car.setMake("Tesla");
        car.setColor("Black");
        car.setConvertible(false);
        car.setModel("Model X");
        car.setDoors(4);
        car.describeCar();

        Car targa = new Car();
        targa.setDoors(2);
        targa.setMake("VW");
        targa.setConvertible(true);
        targa.setModel("132");
        targa.setColor("Blue");
        targa.describeCar();
    }
}
