class MyBike{
    public void topSpeed(){
        System.out.println("Vary on Bike to Bike");
    }
}

class Splendor extends MyBike{
    public void topSpeed(){
        System.out.println("Top Speed of Splendor is 80");
    }
}

class CBZ extends MyBike{
    public void topSpeed(){
        System.out.println("Top Speed of CBZ is 120");
    }
}

class Shine extends MyBike{
    public void topSpeed(){
        System.out.println("Top Speed of Shine is 100");
    }
}

public class pro26 {
    public static void main(String[] args) {
        /*MyBike mb;

        mb = new Splendor();
        mb.topSpeed();

        System.out.println(mb instanceof MyBike);
        System.out.println(mb instanceof Splendor);

        Splendor sp = new Splendor();

        System.out.println(sp instanceof MyBike);
        System.out.println(sp instanceof Splendor);*/

        //Splendor splendor = new MyBike();
        Splendor splendor = (Splendor) new MyBike();
    }
}
