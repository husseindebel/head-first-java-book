public class SimpleDotComTestDrive {
    public static void main(String[] args){
        SimpleDotCom testDotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();
        int[] locations = {2,3,4};

        testDotCom.setLocationCells(locations);

        String fakeGuess = "8";
        String result = testDotCom.checkYourself(fakeGuess);
        if (result.equals("miss")){
            System.out.println("test Passed!");
        } else {
            System.out.println("Test failed");
        }


    }
}
