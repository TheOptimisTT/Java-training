public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;

    }
    public Worker(){
        this("Default name","2023");
    }
    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        int age=currentYear-birthYear;
        //System.out.println(name + " is " + age + " years old");
        return age;
    }

    public double collectedPay(){
        return 0.0;
    }

    public  void terminate(String endDate){
        //System.out.println("Terminated on " + endDate);
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
