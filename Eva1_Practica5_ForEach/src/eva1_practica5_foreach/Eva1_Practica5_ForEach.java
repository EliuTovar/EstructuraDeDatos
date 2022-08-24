
package eva1_practica5_foreach;


public class Eva1_Practica5_ForEach {

    
    public static void main(String[] args) {
        int [] arregloDatos = new int[50];
        
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = (int)(Math.random() * 100);          
        }
        
        for (int arregloDato : arregloDatos) {
            System.out.print("[" + arregloDato + "]");
            
        }
    }
    
}
