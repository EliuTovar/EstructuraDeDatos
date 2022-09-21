/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica8_arreglosobjetos;

/**
 *
 * @author tovar
 */
public class Eva1_Practica8_ArreglosObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba[] arregloPrueba = new Prueba[20];
        for (int i = 0; i < arregloPrueba.length; i++) {
            arregloPrueba[i] = new Prueba();
        }
        
        for(Prueba prueba : arregloPrueba){
            System.out.println(prueba.x);
            
        }
        
    }
    
}

class Prueba{
    int x = 100;
}
