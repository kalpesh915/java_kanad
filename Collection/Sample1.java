public class Sample1 {
    static int x = 10;
    int y = 12;
    public static void main(String[] args) {
        Sample1 sample1_1 = new Sample1();
        Sample1 sample1_2 = new Sample1();

        sample1_1.x += 10;
        sample1_2.x += 20;

        System.out.println(sample1_1.x + sample1_2.y);
    }
}
