/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica21_recursividad;

/**
 *
 * @author tovar
 */
public class Eva1_Practica21_Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MAIN " + A());
        
    }
    
    public static String A(){
        return "A " + B();
        
    }
    public static String B(){
        return "B " + C();
        
    }
    public static String C(){
        return "C";
    }
    
    
}
