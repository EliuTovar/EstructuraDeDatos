
package eva1_practica12_copiaobjetos;


public class Eva1_Practica12_CopiaObjetos {

   
    public static void main(String[] args) {
        
        int valor, copiaValor;
        valor = 100;
        copiaValor = valor;
        
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        valor++;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        
        //AHORA CON OBJETOS
        PruebaValor prueba = new PruebaValor();
        prueba.x = 1000;
        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia = prueba;
        System.out.println("AHORA CON OBJETOS");
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba copia " + pruebaCopia.x);
        prueba.x++;
        System.out.println("Prueba" + prueba.x);
        System.out.println("Prueba copia" + pruebaCopia.x);
    }
    
    
    
}

class PruebaValor{
    int x;
    
}
