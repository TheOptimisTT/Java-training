// 1 = 2.54cm, foot = 12 inch
public class Lecture_2 {
    public static void main(String[] args) {
        System.out.println(covertToCentimeters(5,8));
        System.out.println(covertToCentimeters(68));
        System.out.println(covertToCentimeters(12,8));
    }
    public static double covertToCentimeters(double inch){
        return inch*2.54;
    }
    public static double covertToCentimeters(int feet,int inches){
        return (covertToCentimeters(inches + feet*12));
    }
}
