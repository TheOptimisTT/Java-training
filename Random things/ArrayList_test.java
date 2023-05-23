import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_test {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("VW");
        cars.add("Volvo");
        cars.add("Ford");
        System.out.println(cars);
        System.out.println("============================");
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        System.out.println(cars.get(3));
        System.out.println("============================");
        cars.set(1,"Aston Martin");
        System.out.println(cars);
        System.out.println("============================");
        cars.remove(3);
        System.out.println("============================");
        System.out.println(cars.size());
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
}
