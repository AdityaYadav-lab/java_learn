public class Nested2 {

    public static void main(String args[]) {
       //Number Triangle
       for(int i=1 ; i<=5 ; i++){
        for(int j=1 ; j<=i ; j++){
            System.out.print(i);
           
        }
        System.out.println();
       }
         //Reverse Number Triangle
         for(int i=5 ; i>=1 ; i--){
          for(int j=1 ; j<=i ; j++){
                System.out.print(i);
              
          }
          System.out.println();
         }
     /*
       1
       22
       333
       4444
       55555
     */
    }
}

