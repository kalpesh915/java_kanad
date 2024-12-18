@FunctionalInterface
interface Greetings{
    // SAM interfaces.
    void sum(int i, int j);
    //void sum(float i, float j);
}

public class pro33{
    public static void main(String[] args) {
        Greetings greetings = (int i, int j) -> System.out.println("Sum is "+(i+j));
        greetings.sum(11, 11);
    }
}
