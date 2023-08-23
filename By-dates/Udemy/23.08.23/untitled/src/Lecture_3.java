public class Lecture_3 {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); //1st Test
        System.out.println(getDurationString(-3945)); //2nd Test

        System.out.println(getDurationString(65,45)); //3rd Test
        System.out.println(getDurationString(-65,45)); //4th Test

        System.out.println(getDurationString(65,145)); //5th Test
    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Invalid time S";
        }
        return getDurationString(seconds/60,seconds%60);
    }
    public static String getDurationString(int minutes,int seconds){
        if(minutes<0)
            return "Invalid time M";
        if(seconds<=0||seconds>=59)
            return "Invalid time S 0-59";
        int hours = minutes / 60;
        int remainingMinutes = minutes%60;

        return hours + "h "+remainingMinutes+"m "+seconds+"s";
    }
}
