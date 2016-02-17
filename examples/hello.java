public class hello {
    public static void main(String[] args){
        int x = 3;
        String name = "Hussien";
        char letter = 'a';
        // System.out.println(x + name + letter); // System.out.println(x, name, letter) doesnt work
        // double d = Math.random();
        // System.out.println("The random number is " + d);
/*        int count = 0;
        while (count < 10){
            count++;
            System.out.println(count);
        }
        for (int i = 0; i < 10; i++){
            System.out.println("I am at number "+i);
        }

        */

        if (x < 3){
            System.out.println("You have broken somehting");
        } else {
            x++;
            System.out.println("You have change it to "+ x);
        }

        if (x == 4 | name == "Hussien"){
            System.out.println("It works!");
        }

        boolean y = true;
        if (y){ // y has to be a boolean, int y = 1; will give us an error
            System.out.println("Hello world");
            System.out.print("hellow rodl\n"); // print no new line, println new line
        }

        int hussein = 0;
    //    hussein = "String";

        variables yes = new variables();
        System.out.println(yes);

    }
}
