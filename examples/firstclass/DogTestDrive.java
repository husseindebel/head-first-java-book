class DogTestDrive{
    public static void main(String[] args){
        Dog2 d = new Dog2();   // improved dog object
        d.size = 40; // set one of the instance variables (shouldnt the dog know this)
        d.bark(); // use one of the methods
        Dog2 d = new Dog2();
        d.size = 3; // exposing data
        d.bark(); // different bark yip
        Dog2 d = new Dog2();
        d.size = 81;
        d.bark(); // different bark woof
    }
}
