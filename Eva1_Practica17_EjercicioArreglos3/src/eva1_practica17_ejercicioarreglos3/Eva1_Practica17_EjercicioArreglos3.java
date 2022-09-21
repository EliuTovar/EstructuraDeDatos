
package eva1_practica17_ejercicioarreglos3;


public class Eva1_Practica17_EjercicioArreglos3 {

    
    public static void main(String[] args) {
        int[][] matriz = new int [5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ((int)(Math.random()*100)) + 1; 
                
            }
        }
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
            
        }
      
       int aux;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                
            }
            
        }
        
        
        
        
        
    }
    
    
    
}
