package Thread;

public class Demo3 {
    public static void main(String[] args) {
        Test test =new Test ();

        Thread t1 = new Thread ( () ->test.show());
        Thread t2 = new Thread (() -> test.show());
        t1.start();
        t2.start();
 
    }
}

class Test {

    synchronized void show (){
        System.out.println(Thread.currentThread().getName()+"Inside show");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName()+"show finish ");
    }
}