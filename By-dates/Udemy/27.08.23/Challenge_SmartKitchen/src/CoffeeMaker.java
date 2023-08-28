public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void brewCoffee(){
        if(hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }


    public void setHadWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
