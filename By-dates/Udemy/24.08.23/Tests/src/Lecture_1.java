public class Lecture_1 {

    public static void main(String[] args) {
        //For,while and do while loops
        for (int i=1; i<=5; i++){
            System.out.println(i);
        }


        int j=1;
        while (j<=5){
            //Until (j<=5) is False
            System.out.println(j);
            j++;
        }


        j=1;
        do{
            //Executes at least 1 time. Until (j<=5) is False
            System.out.println(j);
            j++;
        }while(j<=5);


        // Using Continue statement
        int number= 0;
        while (number<50){
            number +=5;
            if(number%25 == 0)
                continue;//skips the next line when if(true)
            System.out.println(number + "_");
        }
    }

}
