public class Main {

    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            LPAStudent s = new LPAStudent("S92300"+i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/198"+i,
                    "Java MasterClass");
            //System.out.println(s);
        }
        Student pojoStudent = new Student("S923006","Ann","05/11/1985","Jave");
        LPAStudent recordStudent = new LPAStudent("S923007","Bill","05/11/1985","Jave");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.getClassList() + ", Java OCP Exam 829"); Build to be immutable

        System.out.println(pojoStudent.getName() + pojoStudent.getClassList()); //difference in .getName()
        System.out.println(recordStudent.name() + recordStudent.classList());  // .name

    }
}
