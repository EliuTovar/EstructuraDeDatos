
package eva1_practica13_pasovalorref;


public class Eva1_Practica13_PasoValorRef {

    
    public static void main(String[] args) {
        int valorPrueba = 100;
        System.out.println("valor = " + valorPrueba);
        incVal(valorPrueba);
        System.out.println("Valor incrementado = " + valorPrueba);
        //----------------------------------------------------------
        PruebaValor prueba = new PruebaValor();
        prueba.x = 100;
        System.out.println("Valor (obj) = " + prueba.x);
        incVal(prueba);
        System.out.println("Valor incrementado(obj) = " + prueba.x);
        
    }
    public static void incVal(int valor){
        valor++;
        
    }
    public static void incVal(PruebaValor pruebaVal){
        pruebaVal.x++;
    }
 
}
class PruebaValor{
    int x;
}
