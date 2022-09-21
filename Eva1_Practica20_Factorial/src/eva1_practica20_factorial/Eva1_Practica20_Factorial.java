
package eva1_practica20_factorial;


public class Eva1_Practica20_Factorial {

    
    public static void main(String[] args) {
        
        System.out.println(factorial(5));
    }
    
    //
    public static int factorial(int valor){
        if(valor == 0){
            return 1;
            
        }else
            return valor * factorial(valor-1);
        
    } 
    
}
