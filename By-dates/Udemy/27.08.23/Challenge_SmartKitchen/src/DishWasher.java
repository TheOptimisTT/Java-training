import org.w3c.dom.ls.LSOutput;

public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("Washing");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
