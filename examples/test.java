public class test {
    static void change(int x, int y){
        x = 7;
        y = 5;
    }
    public static void main(String[] args){
        int x = 0;
        int y = 1;
        change(x, y);
        System.out.println(x+y);
    }
}
