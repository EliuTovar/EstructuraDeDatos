package eva2_practica1_listasimple;

public class Eva2_Practica1_ListaSimple {

    public static void main(String[] args) {
        Lista miLista = new Lista();
        miLista.agregar(10);//0
        miLista.agregar(20);//1
        miLista.agregar(30);//2 aqui tiene que quedar temp
        miLista.agregar(40);//3 <----------insercion
        miLista.agregar(50);//4
        miLista.agregar(60);//5
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.imprimir();
        try {
            miLista.insertarEn(70, 3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        miLista.imprimir();
        miLista.vaciarLista();
        miLista.imprimir();

    }

}
