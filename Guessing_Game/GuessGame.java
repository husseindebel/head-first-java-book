// create the player objects
// run the game
// crappy version

public class GuessGame {
    // instance variables (what does this class know? It knows the players)
    Player p1;
    Player p2;
    Player p3;

    // method (what does this class do? It starts the game)
    public void startGame(){
        // create the player objects
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // hold the guesses for each player
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // hold the players correctness state
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("I am thinking of a number between 0 and 9");

        while (true){
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed "+ guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed "+ guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed "+ guessp3);

            if (guessp1 == targetNumber){
                p1isRight = true;
            } else if (guessp2 == targetNumber){
                p2isRight = true;
            } else if (guessp3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("guess again.");
            }
        }


    }
}
