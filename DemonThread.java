public class DemonThread {
    public static void main(String[] args) {
        Thread T1 =new Thread (() ->{
            while (true) {
                System.out.print("Running...(':') ");
                
            }
        });

        T1.setDaemon(true);
        T1.start();

        try {
            Thread.sleep(2);
        } catch (Exception e) {
            
        }


    }
}
