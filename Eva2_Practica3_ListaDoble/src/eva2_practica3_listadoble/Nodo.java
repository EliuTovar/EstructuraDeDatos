package eva2_practica3_listadoble;

public class Nodo {

    private int valor;
    private Nodo siguiente;
    private Nodo previo;

    //POR DEFAULT, UN NUEVO NODO VA AL FINAL DE LA LISTA
    //EL FINAL DE LA LISTA SE INDICA CON NULL
    //POR ESO SIGUIENTE ES IGUAL A NULL
    public Nodo() {
        this.siguiente = null;
        this.previo = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;

    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
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
