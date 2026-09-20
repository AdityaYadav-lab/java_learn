public class demoThread {
    public static void main(String args[]){
        System.out.println("main thread start");

        Thread t2 =new Thread(() ->{
            try{
                Thread.sleep(2000);

            }
            catch(InterruptedException e){
                System.out.println("thread -0 print ");
            }
        });

        t2.start();


        System.out.println("main thread end");
    }
}
