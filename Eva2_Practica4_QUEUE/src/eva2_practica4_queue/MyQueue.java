/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica4_queue;

/**
 *
 * @author tovar
 */
public class MyQueue {
    //lee, pero no borra el primer nodo de la lista
    public int peek (){
        //verificar si la lista esta vacia
        //si no esta vacia, regresar el valor
        if(listavacia()){
            return null;
        }else{
            return inicio.getvalor();
        }
    }
    
    public Integer poll () throws Exception{
        //verificar si la lista esta vacia
        //si no esta vacia, regresar el valor
        if(listaVacia()){
            return null;
        }else{
            int valor = inicio.getValor();
            //borrar el nodo
            borrarEn(0);
            return valor;
        }
    }
    
    
    
}
