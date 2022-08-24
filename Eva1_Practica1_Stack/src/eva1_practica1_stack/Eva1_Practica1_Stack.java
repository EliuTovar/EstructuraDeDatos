package eva1_practica1_stack;


public class Eva1_Practica1_Stack {

   
    public static void main(String[] args) {
        System.out.println("INICIA MAIN");
        A();
        System.out.println("RETOMA EJECUCION MAIN");
        System.out.println("TERMINA MAIN");
    }
    
    public static void A(){
        System.out.println("INICIA A");
        B();
        System.out.println("RETOMA EJECUCION A");
        System.out.println("TERMINA A");
    } 
    
    public static void B(){
        System.out.println("INICIA B");
       
        int i = 1;
        double d = 10.0;
        System.out.println("Termina B");
    }
    
}


