import java.io.IOException;

public class Pro1 {
    public static void main(String[] args) throws IOException {
        System.out.println("This is Out Stream Example");
        System.err.println("This is Error Stream Example");

        int i = System.in.read();
        System.out.println(i);
    }
}
