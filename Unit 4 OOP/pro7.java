class Box{
    private int h, w, b;

    Box(){
        h = w = b = 0;
    }

    Box(int i){
        h = w = b = i;
    }

    Box(int i, int j){
        h = w = i;
        b = j;
    }

    Box(int i, int j, int k){
        h = i;
        w = j;
        b = k;
    }

    Box(Box tmp){
        h = tmp.h;
        w = tmp.w;
        b = tmp.b;
        volume();
    }

    public void volume(){
        System.out.println("Volume of Box is "+(h*w*b));
    }
}
public class pro7 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.volume();

        Box b2 = new Box(5);
        b2.volume();

        Box b3 = new Box(10, 5);
        b3.volume();

        Box b4 = new Box(4, 5, 6);
        b4.volume();

        Box b5 = new Box(b4);
        b5.volume();
    }
}
