public class p9Factorial {
    public static void main (String arg []){
        int n;
        int fact =1;
        n= Integer.parseInt(arg[0]);

        int i=1;
        while(i<=n){
            i++;
            fact=fact*i;
            
        } 
          /* 
        for(int i=1; i<=n; i++){
            System.out.println(i);
          fact=fact*i;  
        } 
        */
       
         System.out.println("factorial is"+"-->"+n+"="+fact);
         

    }
}
