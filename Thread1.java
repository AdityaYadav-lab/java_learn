public class Thread1 {
    public static void main (String args[]){
        System.out.println("Main thread start");
        
        try {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {}

        System.out.print(" Main thread End");
    }
}