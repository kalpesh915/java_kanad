class demo3{
    int x, y;
    int demo3(int x, int y){
        System.out.println("X is "+x+" Y is "+y);
        return 0;
    }
}
public class pro3 {
    public static void main(String[] args) {
        demo3 d3 = new demo3();
        System.out.println(d3.demo3(11, 22));
    }
}
