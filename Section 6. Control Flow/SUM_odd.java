public class SUM_odd {
    public static void main(String[] args) {
        System.out.println(sumOdd(-4,-2));
        System.out.println(sumOdd(5,2));
        System.out.println(sumOdd(0,-2));
        System.out.println(sumOdd(0,5));
    }
        public static boolean isOdd(int number){
            if(number<=0)
                return false;
            if(number%2==0)
                return false;
            else
                return true;
        }
        public static int sumOdd(int start, int end) {
            int sum=0;
            if(start>end || start<0 || end<0)
                return -1;
            for (int i = start; i <= end ; i++) {
                if(isOdd(i))
                    sum+=i;
            }
            return sum;
        }

    }

