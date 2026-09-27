package Thread;

public class LockDemo4 {
    public static void main(String[] args) {
       TestLock test= new TestLock ();
       Thread p1 = new Thread (()-> test.m1());
       Thread p2 = new Thread (()-> test.m2());
        
        p1.start();
        p2.start();

    }
}

class TestLock {
    synchronized void m1 (){
        System.out.println("m1 entered");

        try{
           Thread.sleep(2000); 
        } catch (Exception e) {};

        System.out.println("m1 exsit");
    }
    synchronized void m2(){
        System.out.println("m2 entered");
        try {
            Thread.sleep(2000);

        } catch (Exception e) {} ;

        System.out.println("m2 exist");
    
    }
}