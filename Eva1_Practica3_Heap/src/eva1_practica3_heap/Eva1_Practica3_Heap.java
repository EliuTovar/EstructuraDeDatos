
package eva1_practica3_heap;

/**
 *
 * @author tovar
 */
public class Eva1_Practica3_Heap {

    
    public static void main(String[] args) {
        int x = 5;
        //obj y obj2 Guardan Referencias
        //En java a las direcciones de memoria se les llama referencias
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(x);
        System.out.println(obj.valor);
        System.out.println(obj2);
    }
    
}

class Prueba{
    public int valor = 100;
    
}
