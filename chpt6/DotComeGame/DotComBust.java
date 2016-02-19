public class DotComBust {
    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom firstDotCom = new DotCom();

        int startingPoint = (int) (Math.random() * 5);

        int[] cellLocation = {startingPoint, startingPoint+1, startingPoint+2};
        firstDotCom.setLocationCells(cellLocation);

        boolean isAlive = true;

        while (isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = firstDotCom.checkYourself(guess);
            numOfGuesses++;
            System.out.println(result);
            if (result.equals("kill")){
                isAlive = false;
            }
        }

        System.out.println("You took "+numOfGuesses+"guesses");
    }
}
