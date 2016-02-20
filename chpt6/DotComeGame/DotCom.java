import java.util.*;


public class DotCom {
    private ArrayList<String> locationCells; // array methods - length
    private String name; // this is very bad



    public void setLocationCells(ArrayList<String> location){
        locationCells = location;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String guess){
        int index = locationCells.indexOf(guess); // if guess is not in list
        // it returns a -1
        if (index >= 0){ // test if the guess is in the list
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                return "You killed "+ name;
            } else {
                return "hit";
            }
        }

        return "miss";
    }
}
