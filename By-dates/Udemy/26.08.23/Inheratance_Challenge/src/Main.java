public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985","01/01/2020");
        System.out.println(tim);
        System.out.println("Age= " + tim.getAge());
        System.out.println("Pay = " + tim.collectedPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990","03/03/2020",35000);
        System.out.println(joe);
        //System.out.println("Age= " + joe.getAge());
        System.out.println("Pay = " + joe.collectedPay());
        joe.retire();
        System.out.println("Pay = " + joe.collectedPay());

        HourlyEmployee marry = new HourlyEmployee("Marry","05/05/1970",
                "03/03/2021",15);
        System.out.println(marry);
        System.out.println("Marry pay " + marry.collectedPay());
        System.out.println("Marry 2xpay " + marry.getDoublePay());
    }
}
