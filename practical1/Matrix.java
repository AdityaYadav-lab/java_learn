public class Matrix {
    public static void main (String args[]){
        int a [][]=new int[2][2];
        int b [][]= new int[2][2];
        int c [][]=new int[2][2];

        int k=0;


        System.out.println("Frist matrix");
        for(int i=0; i<2;i++){
            for (int j=0 ;j<2;j++){
                a[i][j]=Integer.parseInt(args[k++]) ;  
            }   
        }

        System.out.println("second matrix");
        for(int i=0; i<2;i++){
            for (int j=0 ;j<2;j++){
                b[i][j]=Integer.parseInt(args[k++]) ;  
            }
            
        }

        System.out.println("Addition ");
        for(int i=0; i<2;i++){
            for (int j=0 ;j<2;j++){
                c[i][j]= a[i][j]+ b[i][j] ;  
            }
        }

        System.out.println("Addition of matrix");
         for(int i=0; i<2;i++){
            for (int j=0 ;j<2;j++){
                 System.out.print(c[i][j]+" ");   
            }
            System.out.println();
        }
    } 
}