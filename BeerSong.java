public class BeerSong {
    public static void main(String[] args){
        int beerCount = 99;
        String bottleWord = " bottles ";
        while (beerCount > 0){
            System.out.println(beerCount + bottleWord + "of beer on the wall");
            System.out.println(beerCount + bottleWord + "of beer");
            beerCount--;
            if (beerCount == 1){
                bottleWord = " bottle ";
            }
            if (beerCount == 0) {
                System.out.println("Take one out and pass it around, No more" +
                    " bottles of beer on the wall");
                System.out.println("No more bottles of beer");
            } else {
                System.out.println("Take one out and pass it around " + beerCount +
                    bottleWord + "of beer on the wall");
            }
        }
    }
}
