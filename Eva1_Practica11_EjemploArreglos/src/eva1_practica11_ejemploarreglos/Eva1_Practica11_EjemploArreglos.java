
package eva1_practica11_ejemploarreglos;

import java.util.Scanner;




public class Eva1_Practica11_EjemploArreglos {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int iEstu = 0;
        int cali = 0;
        int arregloCali[][];
        
        System.out.println("Introduce el numero de grupos: ");
        int iGpos = entrada.nextInt();
        arregloCali = new int [iGpos][];
        
        for (int i = 0; i < arregloCali.length; i++) {
            System.out.println("Cuantos estudiantes hay en el grupo " + (i + 1));
            iEstu = entrada.nextInt();
            arregloCali[i] = new int[iEstu];
            
             for (int j = 0; j < arregloCali[i].length; j++) {
                System.out.println("ingrese la calificacion del alumno " + (j + 1));
                cali = entrada.nextInt();
                arregloCali[j] = new int[cali];
                
            }
        }
        System.out.println("");
        for (int i = 0; i < arregloCali.length; i++) {
            for (int j = 0; j < arregloCali[i].length; j++) {
                System.out.println("Grupo: " + iGpos + "Alumno: " + iEstu + "Calificacion: " + cali);
                
            }
            
        }
       
        
        
        
    }
    
}
