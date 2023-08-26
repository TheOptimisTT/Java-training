public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
    public void printAll(){
        System.out.println(getName());
        System.out.println(getCreditLimit());
        System.out.println(getEmail());
        System.out.println();
    }

    public Customer(String name,double creditLimit, String email){
        //System.out.println("Constructor with parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public Customer(){
        this("Default_name","Default_email");
        System.out.println("Default_Constructor call");
    }
    public Customer(String name, String email){
        this(name,0.0,email);
    }
}
