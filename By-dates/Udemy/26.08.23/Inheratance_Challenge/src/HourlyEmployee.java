public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }



    @Override
    public double collectedPay() {
        return 40*hourlyPayRate;
    }

    public double getDoublePay(){
        return 2*collectedPay();
    }
}
