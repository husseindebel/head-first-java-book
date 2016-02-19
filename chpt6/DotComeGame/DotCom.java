import java.util.ArrayList;


public class DotCom {
    private ArrayList<String> locationCells; // array methods - length
    private int numOfHits = 0; // this is very bad


    public String checkYourself(String guess){
        // check for a valid guess between 0 and 7
    //    if (Integer.parseInt(guess) < 0 || Integer.parseInt(guess) > 7) return "invalid";

        int index = locationCells.indexOf(guess); // if guess is not in list
        // it returns a -1
        if (index >= 0){ // test if the guess is in the list
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                return "kill";
            } else {
                return "hit";
            }
        }

        return "miss";
    }

    public int[] getLocationCells(){
        return locationCells;
    }
    public void setLocationCells(ArrayList<String> location){
        locationCells = location;
    }
}
