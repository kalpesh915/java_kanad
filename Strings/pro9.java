public class pro9 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Kanad Joshi");
        StringBuffer sb3 = new StringBuffer(16);

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        sb2.append(" Java Student");
        System.out.println(sb2);

        sb2.insert(0, "From Rajkot");
        System.out.println(sb2);

        sb2.replace(0, 5, "Ahamdabad");
        System.out.println(sb2);

        sb2.delete(0, 20);
        System.out.println(sb2);

        System.out.println(sb2.reverse());
    }
}
