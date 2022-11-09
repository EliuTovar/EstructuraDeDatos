package eva2_practica1_listasimple;

public class Nodo {

    private int valor;
    private Nodo siguiente;

    //POR DEFAULT, UNI NUEVO NODO VA AL FINAL DE LA LISTA
    //EL FINAL DE LA LISTA SE INDICA CON NULL
    //POR ESO SIGUIENTE ES IGUAL A NULL
    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
