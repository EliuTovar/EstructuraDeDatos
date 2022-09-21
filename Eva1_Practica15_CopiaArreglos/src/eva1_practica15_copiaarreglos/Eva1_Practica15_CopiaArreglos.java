
package eva1_practica15_copiaarreglos;


public class Eva1_Practica15_CopiaArreglos {

    
    public static void main(String[] args) {
        int[] arregloDatos = new int[100];
        llenar(arregloDatos);
        imprimir(arregloDatos);
        
        int[] arregloCopia = new int[arregloDatos.length];
        System.out.println(arregloDatos);
        System.out.println(arregloCopia);
        llenar(arregloCopia);
        imprimir(arregloCopia);
        
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloCopia[i] = arregloDatos[i];  
        
        }
    }
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random()*10);
            
        }
    }
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
        }
    }
    
    
}
