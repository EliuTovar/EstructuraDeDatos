
package eva2_practica6_arbolbinario;


public class ArbolBinario {
    private Nodo root;

    public ArbolBinario(Nodo root) {
        this.root = null;
    }

    public ArbolBinario() {
    }

   
    
    //metodo publico para el usuario
    public void agregar(int valor){
        //1.- QUE EL NODO RECIBIDO ES NULL
        //Arbol vacio
        if(root == null)
            root = new Nodo(valor);
        else
        agregarRecur(valor, root);
    }
    
    //metodo recursivo agregar
    ////necesita el valor y el nodo actual
    private void agregarRecur(int valor, Nodo nodoActual){
        
        //2.- DECIDIR SI VA A IZQ O DER
        /*
            Verificar si el lado (nodo) es null
                si es null, ahi va el valor
            si no
                repetir recursion
        */
        Nodo nuevo = new Nodo(valor);
        if(valor<nodoActual.getValor()){
            if(nodoActual.getIzquierda() == null)
                nodoActual.setIzquierda(nuevo);
            else
                agregarRecur(valor, nodoActual.getIzquierda());
            
        }else if(valor>nodoActual.getValor()){
            if(nodoActual.getDerecha()==null)
            nodoActual.setDerecha(nuevo);
            else
                agregarRecur(valor, nodoActual.getDerecha());
            
        }else{//IGUAL
            System.out.println("ELEMENTO REPETIDO");
            
        }
       
        
        
    }
     //IMORESION DE VALORES:
        
        //izq valor der
        //METODO PUBLICO
    //IN ORDER
    public void inOrder(){
        inOrderRecu(root);
        System.out.println("");
        
    }
        //metodo privado recursivo
    private void inOrderRecu(Nodo nodo){
        if(nodo != null){
            inOrderRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecu(nodo.getDerecha());
        }
        
    }
    private void preOrderRecu(Nodo nodo){
        
        
    }
    
    
    
    
}
