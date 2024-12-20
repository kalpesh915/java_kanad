interface Greetings1{
    void gm();
    void gn();
}

public class pro34{
    public static void main(String[] args) {
        Greetings1 greetings1 = new Greetings1() {
            @Override
            public void gm() {
                System.out.println("Good Morning");
            }

            @Override
            public void gn() {
                System.out.println("Good Night");
            }
        };

        greetings1.gm();
        greetings1.gn();
    }
}
