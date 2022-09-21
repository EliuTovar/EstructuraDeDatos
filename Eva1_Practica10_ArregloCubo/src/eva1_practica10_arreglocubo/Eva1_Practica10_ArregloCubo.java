/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica10_arreglocubo;

/**
 *
 * @author tovar
 */
public class Eva1_Practica10_ArregloCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] cuboDatos = new int[3][4][5];
        for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    cuboDatos[i][j][k] = 50; 
                }
                
            }
            
        }
        for (int i = 0; i < cuboDatos[i].length; i++) {
            System.out.println("[" + cuboDatos[i] + "]");
            
            
        }
    }
    
}
