/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica7_medirtiempo;

/**
 *
 * @author tovar
 */
public class Eva1_Practica7_MedirTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long ini = System.nanoTime();
        int[] datos = new int[100000000];
        for(int i = 0; i < datos.length; i++){
            datos[i] = 100;
        }
        
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
             
        
    }
    
}
