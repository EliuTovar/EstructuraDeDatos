/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica19_gratestcommondivisor;

/**
 *
 * @author tovar
 */
public class Eva1_Practica19_GratestCommonDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(gcd(180, 48));
    }

    public static int gcd(int dividendo, int divisor) {
        int residuo;
        residuo = dividendo % divisor;

        if (residuo == 0) {
            return divisor;
        }else{
            return gcd(divisor, residuo);
            
        }
        
    }
}
