public class ThreadJoin {
     public static void main (String args[]){
        System.out.println("Main thread start");

        Thread t1 =new Thread(() -> {    
        try {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {} 
          System.out.println("thread-0 start"); 
        });

        t1.start();
        try {
            t1.join(3000); 
        } 
        catch (InterruptedException e) {}
       
        System.out.println("Main thread End");
    }
}
