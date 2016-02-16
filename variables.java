public class variables {
    public static void main(String[] args){
        Dog[] first; // Dog array reference variable (going to point to the beginning)
        // of an array of dog references
        first = new Dog[7]; // new Dog[7] creates an array of Dog reference variables
        // of size 7
        System.out.println(first[0]); // this will be print out null
        // initially all the references point to null
        // no dog objects yet, have to create one for each reference
        first[0] = new Dog(); // creates a new dog object that the first index will now
        // refer too
        System.out.println(first[0]); // print out some memory address
        // rest of the array still points to null
        first[1] = first[0];
        System.out.println(first[1]);
    }
}
