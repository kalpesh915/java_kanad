public class pro5 {
    public static void main(String[] args) {
        String ip1 = "Java";
        String ip2 = "Java";
        String ip3 = new String("Java");
        String ip4 = "java";

        System.out.println(ip1 == ip2);
        System.out.println(ip1 == ip3);

        System.out.println(ip1.equals(ip3));
        System.out.println(ip1.equals(ip4));
        System.out.println(ip1.equalsIgnoreCase(ip4));
    }
}
