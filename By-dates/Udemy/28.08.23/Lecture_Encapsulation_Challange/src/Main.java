public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(80,true);
        Printer nonDuplex = new Printer(80,false);
        System.out.println(printer.getPagesPrinted()); // 0

        System.out.println("Print 100 pages. Jobs: " + printer.printPages(100)); //50
        System.out.println("Print 3 pages. Jobs: " + printer.printPages(3)); // 2
        System.out.println("Total printed: " + printer.getPagesPrinted()); //52

        System.out.println("Print 100 pages. Jobs: " + nonDuplex.printPages(100)); //100
        System.out.println("Print 3 pages. Jobs: " + nonDuplex.printPages(3)); // 3
        System.out.println("Total printed: "+ nonDuplex.getPagesPrinted()); //103

        System.out.println("Adding 10: " + printer.addToner(10)); //90
        System.out.println("Adding 10: " + printer.addToner(10)); // 100
        System.out.println("Adding 10: " + printer.addToner(10)); // -1
        System.out.println(printer.getTonerLevel());// 100


    }
}
