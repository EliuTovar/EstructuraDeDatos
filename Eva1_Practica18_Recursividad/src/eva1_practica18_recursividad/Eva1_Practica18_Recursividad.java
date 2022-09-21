package eva1_practica18_recursividad;

public class Eva1_Practica18_Recursividad {

    public static void main(String[] args) {
        int valor = 5;
        falsoForDes(valor);
        

    }

    //Falso FOR
    //Imprimir una lista de numeros de mayor a menor(de manera recursiva)
    //recibo un valor falsoForDes(5) --> *5 - 4 - 3 - 2 - 1*
    public static void falsoForDes(int valor) {
//        que voy a hacer *imprimir valor*
//        llamada recursiva *falsoForDes(valor - 1)
//        detener la llada recursiva *cuando valor - 1*
          if(valor >= 1){
              System.out.print(valor + " - ");
              valor--;
              falsoForDes(valor);
              
          }
          
    }
    
    //falsoForAsc(5) --> 1 - 2 - 3 - 4 - 5
    public static void falsoForAsc(int valor, int ini){
        if (ini <= valor) {
            System.out.println(ini + " - ");
            falsoForAsc(valor, ini + 1);
            
        }
    }
}
