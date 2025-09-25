package week02_firstprograms;

public class Swap {
    public static void main(String[] args) {
        //in
        int a;
        int b;
        
        //data
        a = 34;
        b = 89;
        
        //Varianta 1
        //System.out.println(b + " " + a);
        
        //Varianta 2
//        int temp = a;
//        a = b;
//        b = temp;
//        
//        System.out.println(a + " " + b);
        
        //Varianta 3
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println(a + " " + b);        
        
    }
}
