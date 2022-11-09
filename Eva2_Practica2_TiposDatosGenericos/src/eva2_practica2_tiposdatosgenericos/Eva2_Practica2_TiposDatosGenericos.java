package eva2_practica2_tiposdatosgenericos;

import java.util.LinkedList;


public class Eva2_Practica2_TiposDatosGenericos {

    
    public static void main(String[] args) {
        LinkedList <String> miLista = new <String> LinkedList();
        TiposDeDatosGenericos <Integer> miObj = new <Integer> TiposDeDatosGenericos();
        miObj.setValor(100);
        System.out.println(miObj.getValor());
        
    }
    
}

class TiposDeDatosGenericos<T>{
    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
    
}
