import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;


    public void setUpGame(){

        // dotcom objects
        DotCom firstDotCom = new DotCom();
        DotCom secondDotCom = new DotCom();
        DotCom thirdDotCom = new DotCom();

        // set the name for each dotCom
        firstDotCom.setName("Google");
        secondDotCom.setName("Amazon");
        thirdDotCom.setName("Facebook");

        // add dotcoms to instance object
        dotComsList.add(firstDotCom);
        dotComsList.add(secondDotCom);
        dotComsList.add(thirdDotCom);

        System.out.println("Your goal is to sink three dot coms");
        System.out.println("Google, amazon, facebook");
        System.out.println("Try to sink in least amount of turns");

        // set a location for each dotcom
        for (DotCom current : dotComsList){

            ArrayList<String> location = helper.placeDotCom(3);
            current.setLocationCells(location);
        }


    }

    public void startPlaying(){
        while (!dotComsList.isEmpty()){
            String userInput = helper.getUserInput("Enter a guess: ");
            checkUserGuess(userInput);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess){
        numOfGuesses++;

        String result = "miss";
        for (DotCom current : dotComsList){
            result = current.checkYourself(userGuess);
            if (result == "kill"){
                dotComsList.remove(current);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame(){
        System.out.println("game over mate");
        if (numOfGuesses < 18){
            System.out.println("Good job");
        } else {
            System.out.println("Horrifying");
        }
        System.out.println("Your score "+numOfGuesses);
    }

}
