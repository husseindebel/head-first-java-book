// this is an improvement over the initial dog class, in that
// the method bark will change behavior depending on the
// state of the object

class Dog2 {
    private int size;
    private String name;

    public int getSize(){
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

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
