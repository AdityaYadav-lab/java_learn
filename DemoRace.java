public class DemoRace {
    public static void main(String[] args) throws InterruptedException {
        counter  c1 =new counter();

        Thread t1 =new Thread (() -> {
            for(int i=0;i<=10000;i++){
               c1.increment();
                
            }
        });
        Thread t2 =new Thread (() -> {
            for(int i=0;i<=10000;i++){
               c1.increment();
                
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
  

    }
}

    class counter {
        public int count =0;

           synchronized void increment(){
                   count ++;
        }
    }
