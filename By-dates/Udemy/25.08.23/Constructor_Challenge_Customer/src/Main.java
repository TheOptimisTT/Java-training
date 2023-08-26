public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.printAll();

        Customer c2 = new Customer("John",500,"@gmail");
        c2.printAll();

        Customer c3 = new Customer("Alex","@yahoo");
        c3.printAll();
    }
}
