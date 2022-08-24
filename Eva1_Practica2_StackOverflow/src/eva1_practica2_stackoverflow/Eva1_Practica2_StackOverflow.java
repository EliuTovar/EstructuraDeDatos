package eva1_practica2_stackoverflow;

/**
 *
 * @author tovar
 */
public class Eva1_Practica2_StackOverflow {

    
    public static void main(String[] args) {
        A();
        
    }
    
    public static void A(){
        B();
    }
    
    public static void B(){
        A();
    }
    
}
