//MegaBytes Converter
public class FirstTask {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(1024*2);
        printMegaBytesAndKiloBytes(1024*2+100);
        printMegaBytesAndKiloBytes(-1024);
    }
     public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kiloBytes / 1024;
        int left = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + left + " KB");
     }
}
