//Barking Dog
public class Task_2 {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 9));
        System.out.println(shouldWakeUp(false, 9));
        System.out.println(shouldWakeUp(true, -9));
        System.out.println(shouldWakeUp(false, -9));
        System.out.println(shouldWakeUp(false, 23));
        System.out.println(shouldWakeUp(true, 7));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        //before 8 or after 22 hours so in that case return true
        if(hourOfDay>23 || hourOfDay<0)
            return false;
        return (hourOfDay < 8 || hourOfDay > 22) && barking;
    }
}
