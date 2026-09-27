public class p8Greet {
    public static void main (String arg []){
        int mark;
        mark=Integer.parseInt(arg[0]);


        if(mark>=90){
            System.out.println("A grade" +mark);
        }
        else if (mark>=80){
            System.out.println("B grade "+mark);  
        }
        else if (mark>=70){
            System.out.println("C grade "+mark);
        }
        else{
            System.out.println ("D grade "+mark);
        }
    }
    
}
