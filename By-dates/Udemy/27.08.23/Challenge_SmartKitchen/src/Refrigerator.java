import javax.swing.plaf.IconUIResource;

public class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood(){
        if(hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
