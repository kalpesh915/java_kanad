public class pro10 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        sb1.append("Kanad Joshi");
        System.out.println(sb1.capacity());
        sb1.append("From Rajkot Learning");
        System.out.println(sb1.capacity());

        sb1.ensureCapacity(50);
        System.out.println(sb1.capacity());
    }
}
