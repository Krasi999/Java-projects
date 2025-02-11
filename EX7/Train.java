package EX7;
import java.util.Stack;

public class Train {
    private Stack<String> wagons;

    public Train(){
        wagons = new Stack<>();
    }

    public void addWagons(String wagon){
        wagons.push(wagon);
        System.out.println(wagon + " has been added!");
    }

    public String removeWagons(){
        if(wagons.isEmpty()){
            System.out.println("There arent any wagons to remove!");
            return null;
        }
        String removedWagon= wagons.pop();
        System.out.println(removedWagon + " has been removed!");
        return removedWagon;
    }
}
