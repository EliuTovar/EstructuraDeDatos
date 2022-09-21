
package eva1_practica16_ejercicioarreglos5;


public class Eva1_Practica16_EjercicioArreglos5 {

    
    public static void main(String[] args) {
        
        
        
        int[] arregloDatos = new int[50]; 
        int contador = 0;
        
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = ((int)(Math.random()*100)) + 1; 
            if((arregloDatos[i] % 2) == 0){
                contador++;
            }
            
        }
        System.out.println("Pares: " + contador);
        int[] arregloPares = new int[contador];
        int pares = 0;
        for (int i = 0; i < arregloDatos.length; i++) {
            if((arregloDatos[i] % 2) == 0){
                arregloPares[pares] = arregloDatos[i];
                pares++;
            }
            
        }
        
        for (int i = 0; i < arregloDatos.length; i++) {
            System.out.print("[" + arregloDatos[i] + "]");  
        }    
        
        for (int i = 0; i < arregloPares.length; i++) {
            System.out.print("[" + arregloPares[i] + "]");
            
        }
        
    }  
}
