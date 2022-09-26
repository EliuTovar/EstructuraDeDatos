/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica22_fibonacci;

/**
 *
 * @author tovar
 */
public class Eva1_Practica22_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=1;
        while(x!=8){
            System.out.println(Eva1_Practica22_Fibonacci.fibonacci(x));
            x++;
    }
    }
    
    public static int fibonacci(int n){
        if(n<2)
            return n;
        else
            return (fibonacci(n-1)+fibonacci(n-2));
    }
    
}
