public class Nested {
      public static void main (String args[]){
        // Star Pattern 
        for (int i =1 ; i<=5 ; i++){
            for (int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         //reverse star 
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
       
      }    
}
