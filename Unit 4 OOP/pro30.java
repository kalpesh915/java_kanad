abstract class Shape{
    int sharpness = 10;

    Shape(){
        System.out.println("Shape Constructor Called");
    }

    abstract public void draw();

    public void getSharpness(){
        System.out.println("Sharpness is "+sharpness);
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
}

class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

public class pro30 {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw();
        shape.getSharpness();
    }
}
