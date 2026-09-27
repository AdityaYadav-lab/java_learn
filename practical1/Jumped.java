public class Jumped{
    public static void main(String[] args) {
        //use of break in loop
        for (int i=1 ; i<=10; i++){
            System.out.println("print the value of i ="+i);
            if(i>=5){
                break; // use the break for stop  the loop 
            }
         }
 
        int p=Integer.parseInt(args[0]);
        System.out.println("the number is "+p);
        for(int i= 2; p>i; i++){ 
            System.out.println("the number is "+p);
            System.out.println("the i value is "+i);
            if (p%i==0){
                System.out.println("the number is prime");
            }else{
                System.out.println("the number is not prime");
            }
         }
    }
}