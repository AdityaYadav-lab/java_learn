public class p1swapping{
    public static void main(String[] args) {
        int a;
        int b;
        a =Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        myswapping s1 =new myswapping();
        s1.swapping(a,b);

    }
   
}
    class myswapping {
        void swapping ( int a , int b ){
             System.out.println("before swapping a="+a+" "+"b ="+b);
             int temp;
             temp=a;
             a=b;
             b=temp;
             System.out.println("After swapping a="+a+" "+"b ="+b);

        }
    }
