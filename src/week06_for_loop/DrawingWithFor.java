package week06_for_loop;

public class DrawingWithFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Radek symbolu");
        int n = 5;
        char symbol = '#';
        
        for(int i = 1; i <= n ;i++){
            System.out.print(symbol + " ");
        }
        System.out.println("");
        
        System.out.println("");
        System.out.println("Obdelnik");
        int a = 5;
        int b = 7;
        
        for(int i = 1; i <= a; i++){
            System.out.print(i + ". ");
            for(int j = 1; j <= b ;j++){
                System.out.print(symbol + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Trojuhelnik pravouhly");
        int m = 5;
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(symbol + " "); 
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Trojuhelnik rovnostranny");
        int c = 5;
        
        for(int i = 1; i <= c; i++){ //iterace po radcich
            for(int k = 1; k <= c-i; k++){ //vypis c-i mezer na radek
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++){ //vypis i symbolu na stejny radek
                System.out.print(symbol + " "); 
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Kosoctverec");
        int d = 5;
        for(int i = 1; i <= d; i++){ //iterace po radcich
            for(int k = 1; k <= d-i; k++){ //vypis c-i mezer na radek
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++){ //vypis i symbolu na stejny radek
                System.out.print(symbol + " "); 
            }
            System.out.println("");
        }
        
        for(int i = 1; i <= d - 1; i++){ //iterace po radcich
            for(int k = 1; k <= i; k++){ //vypis i mezer na radek
                System.out.print(" ");
            }
            for(int j = 1; j <= d - i ; j++){ //vypis d- i symbolu na stejny radek
                System.out.print(symbol + " "); 
            }
            System.out.println("");
        }
        
              
        
        
        
        
        
    }
    
    
}
