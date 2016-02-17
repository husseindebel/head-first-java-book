class DogTestDrive{
    public static void main(String[] args){
        Dog2 awesomeDog = new Dog2();
        awesomeDog.setName("Scruffy"); // our instance variables have been encapsulated
        awesomeDog.setSize(5); // cannot access them from here
        System.out.println("My dogs name is "+awesomeDog.getName());
        System.out.println("My dogs size is "+awesomeDog.getSize());
        awesomeDog.bark();
    }
}
