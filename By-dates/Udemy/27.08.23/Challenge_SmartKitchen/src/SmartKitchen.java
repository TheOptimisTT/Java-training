public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean brewMaster, boolean iceBox, boolean dishWasher){
        this.brewMaster.setHadWorkToDo(brewMaster);
        this.dishWasher.setHasWorkToDo(dishWasher);
        this.iceBox.setHasWorkToDo(iceBox);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();

    }
    public void addWater(){
        this.brewMaster.setHadWorkToDo(true);
    }
    public void pourMilk(){
        this.iceBox.setHasWorkToDo(true);
    }
    public void loadDishwasher(){
        this.dishWasher.setHasWorkToDo(true);
    }
}
