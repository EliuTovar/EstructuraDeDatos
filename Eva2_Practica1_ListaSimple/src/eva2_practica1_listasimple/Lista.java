package eva2_practica1_listasimple;

public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

    //POR DEFAULT LA LISTA ESTA VACIA
    public Lista() {
        this.inicio = null;//NO HAY NODOS EN LA LISTA
        this.fin = null;
        this.cont = 0;
    }
    
    public boolean listaVacia(){
        if (inicio == null){
            return true;
        }else
            return false;
    }

    public void imprimir() {
        if (listaVacia()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo temp = inicio;
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
        }
    }

    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        //VERIFICAR SI HAY NODOS EN LA LISTA
        if (inicio == null) {//NO HAY NODOS EN LA LITSA
            inicio = nuevoNodo;
            fin = nuevoNodo;

        } else {//HAY NODOS EN LA LISTA
            //HAY QUE MOVERNOS POR LA LISTA
            //USANDO UN NODO TEMPORAL HASTA EL ULTIMO DE LA LISTA
            /*Nodo temp = inicio;
            //¿COMO MUEVO ELL TEMP?
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);*/
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;

        }
        cont++;

    }

    public int tamaLista() {
        /*int cont = 0;
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }*/
        return this.cont;
    }

    public void insertarEn(int valor, int pos) throws Exception {
        int cantNodos = tamaLista();
        //¿que debemos validar?
        //insertar en una posicion no valida
        if (pos < 0)//posiciones negativas
        {
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if (pos >= cantNodos)//posiciones mayores a la cantidad de elementos
        {
            throw new Exception(pos + "no es una posicion valida en la lista");
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            if (pos == 0) {//insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                while (cont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    cont++;

                }
                nuevoNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevoNodo);
            }
            this.cont++;

        }

    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        cont = 0;
    }
    
    public void borrarEn(int pos) throws Exception{
        int cantNodos = tamaLista();
        if(pos < 0)
            throw new Exception("No puede insertarse un nodo en la lista");
            else (pos >= cantNodos)
                throw new Exception(pos + " no es una posicion valida en la lista");
        }
        
    
    public void obtenerValorEn() throws Exception{
        int cantNodos = tamaLista();
        int pos = 0;
        //¿que debemos validar?
        //insertar en una posicion no valida
        if (pos < 0)//posiciones negativas
        {
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if (pos >= cantNodos)//posiciones mayores a la cantidad de elementos
        {
            throw new Exception(pos + "no es una posicion valida en la lista");
        } else {
            int valor = 0;
            Nodo nuevoNodo = new Nodo(valor);
            if (pos == 0) {//insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                while (cont < pos) {
                    temp = temp.getSiguiente();
                    cont++;
    }
            }
            this.cont--;
        }
    }
}
