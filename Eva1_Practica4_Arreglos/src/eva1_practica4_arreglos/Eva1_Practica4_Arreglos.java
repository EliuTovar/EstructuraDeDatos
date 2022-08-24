package eva1_practica4_arreglos;


public class Eva1_Practica4_Arreglos {

    
    public static void main(String[] args) {
        //Tipo de dato [] IDENTIFICADOR --> new TIPO DE DATO [TAMAÑO]
        //ARREGLO DE ENTEROS PARA CAPTURAR EDADES:
        //TODOS LOS INDENTIFICADORES DECLARADOS SON ARREGLOS DE ENTEROS
        int [] arregloEdades, arregloSalario, arregloCali;
        //SOLO arregloPromedio ES ARREGLO
        double arregloPromedio[], porcentaje;
        //LOS ARREGLOS SON OBJETOS
        arregloEdades = new int[50];
        System.out.println(arregloEdades);
        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i] = (int)(Math.random() * 100);          
        }
        
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[" + i + "] = " + arregloEdades[i]);
            
        }
        
        
        
    }
    
}
