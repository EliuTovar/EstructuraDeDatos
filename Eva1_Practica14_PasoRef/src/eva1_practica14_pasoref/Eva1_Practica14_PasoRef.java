
package eva1_practica14_pasoref;


public class Eva1_Practica14_PasoRef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arregloDatos = new int[100];
        llenar(arregloDatos);
        imprimir(arregloDatos);
        
        
           
       
        
    }
    
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 100;
            
        }
    }
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
        }
    }
    
    
}
