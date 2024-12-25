class Counter{
    int count;
    synchronized public void increment(){
        count++;
    }
}

class MyThread1 extends Thread{
    Counter counter;
    MyThread1(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i = 1; i<= 1000; i++){
            counter.increment();
            try{
                Thread.sleep(1);
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
        }
    }
}

class MyThread2 extends Thread{
    Counter counter;
    MyThread2(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i = 1; i<= 1000; i++){
            counter.increment();
            try{
                Thread.sleep(1);
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
        }
    }
}

public class pro17 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread1 m1 = new MyThread1(counter);
        m1.start();

        MyThread2 m2 = new MyThread2(counter);
        m2.start();

        try{
            m1.join();
            m2.join();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }

        System.out.println(counter.count);
    }
}
