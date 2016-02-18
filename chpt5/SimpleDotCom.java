public class SimpleDotCom {
    private int[] locationCells; // array methods - length
    private int numOfHits = 0; // this is very bad
    public String checkYourself(String guess){
        int position = 0;
        int userGuess = Integer.parseInt(guess);
        if (userGuess > 6 || userGuess < 0){
            return "invalid place";
        }
        for (int cell : locationCells){
        //    System.out.println(cell + "" + userGuess);
            if (cell == userGuess){
                numOfHits++;
                // find out if the dotcom sinks
                if (numOfHits == locationCells.length){
                    return "kill";
                } else {
                    locationCells[position] = -1;
                    return "hit";
                }
            }
            position++;
        }

        return "miss";
    }

    public int[] getLocationCells(){
        return locationCells;
    }
    public void setLocationCells(int[] location){
        locationCells = location;
    }
}
