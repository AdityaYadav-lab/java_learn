package Thread;
public class SyncThread {
    public static void main(String[] args) {
        Test t1 =new Test();

        Thread p1 =new Thread(() -> t1.show());

        Thread p2 =new Thread(() -> t1.show());
    }
}


class Test {

    void show(){
        System.out.println(Thread.currentThread().getName()+"Inside show");

        try {
            Thread.sleep(2000);
        }
         catch (Exception e) {}
       System.out.println(Thread.currentThread().getName()+"show exist");
    }   
}
