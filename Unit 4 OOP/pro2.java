class demo2{
    int x, y;

    public void setValues(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void getValues(){
        System.out.println("x is "+x+" y is "+y);
        System.out.println("x is "+this.x+" y is "+this.y);
    }
}

public class pro2 {
    public static void main(String[] args) {
        demo2 d2 = new demo2();
        d2.setValues(11, 22);
        d2.getValues();
    }
}
