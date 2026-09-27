public class Nested3 {
    public static void main (String args[]){
     /*
     A
     AB
     ABC
     ABCD
     ABCDE
     */
    for(int i=1;i<=5;i++){
        for(char j='A';j<'A'+i;j++){
            System.out.print(j);
        }
        System.out.println();                   
    }

/*
*****
*****
*****
*****
*****
*/
for(int i=1;i<=5;i++){
    for(int j=1;j<=5;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
