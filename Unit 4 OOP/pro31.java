interface Mobile{
    void Camera();
    void RAM();
    void ROM();
    void Battery();
    default void AudioJack(){
        System.out.println("Audio Jack is Available");
    }
}

class SamsumgA20 implements Mobile{

    @Override
    public void Camera() {
        System.out.println("Camera of Samsumg");
    }

    @Override
    public void RAM() {
        System.out.println("Ram of Samsumg");
    }

    @Override
    public void ROM() {
        System.out.println("ROM of Samsumg");
    }

    @Override
    public void Battery() {
        System.out.println("Battery of Samsumg");
    }
}

class Apple16 implements Mobile{

    @Override
    public void Camera() {
        System.out.println("Camera of Apple");
    }

    @Override
    public void RAM() {
        System.out.println("RAM of Apple");
    }

    @Override
    public void ROM() {
        System.out.println("ROM of Apple");
    }

    @Override
    public void Battery() {
        System.out.println("Battery of Apple");
    }
}

public class pro31 {
    public static void main(String[] args) {
        Mobile mobile;
        mobile = new SamsumgA20();

        mobile.Camera();
        mobile.AudioJack();

    }
}
