package exceptions;
class Demo1{
    public static void main (String arg[]){
       //exaption handling 
       System.out.println("step1");
       try {
        int a = 20;
        int b =0;
        System.out.println(a/b);
       }
        catch (ArithmeticException e) {
         System.out.println("exception is solved");
       }
       System.out.println("step2");

        
    }
}