// this is an improvement over the initial dog class, in that
// the method bark will change behavior depending on the
// state of the object

class Dog2 {
    int size;
    String name;

    void bark(){
        if (size > 60){
            System.out.println("Woof");
        } else if (size > 14){
            System.out.println("Ruff");
        } else {
            System.out.println("Yip");
        }
    }
}
