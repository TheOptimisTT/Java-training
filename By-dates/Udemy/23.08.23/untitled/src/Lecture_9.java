public class Lecture_9 {

    public static void main(String[] args) {

        System.out.println("The sum of the numbers divided"+" by 3 and 5 is "
                + challange(1,1000,4));
    }
    public static int challange(int start, int end, int matchLimit){
        int sum=0;
        int count=0;
        if(start>end){
            System.out.println("Bad start/end");
            return -1;
        }
        for(int i = start; count<matchLimit && i<=end; i++){
            if(i%3==0&&i%5==0) {
                sum += i;
                count++;
            }
        }
        return sum;
    }
}
