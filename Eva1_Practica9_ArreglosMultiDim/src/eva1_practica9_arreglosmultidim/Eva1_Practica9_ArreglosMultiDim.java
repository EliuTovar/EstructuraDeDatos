
package eva1_practica9_arreglosmultidim;


public class Eva1_Practica9_ArreglosMultiDim {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizDatos = new int[3][5];
        System.out.println("Filas: " + matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++) {//PRIMER DIMENSION (3 FILAS)
            System.out.println("Columnas: " + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++) {//SEGUNDA DIMENSION (5 COLUMNAS)
                matrizDatos[i][j] = 100;
                
            }

        }
        System.out.println("");
        for (int i = 0; i < matrizDatos.length; i++) {//PRIMER DIMENSION (3 FILAS)   
            for (int j = 0; j < matrizDatos[i].length; j++) {//SEGUNDA DIMENSION (5 COLUMNAS)
                System.out.print("[" + matrizDatos[i][j] + "]");
            }
            System.out.println("");
        }
                
    }
    
}
