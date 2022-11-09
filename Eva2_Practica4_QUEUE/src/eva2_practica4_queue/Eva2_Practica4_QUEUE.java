/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica4_queue;

/**
 *
 * @author tovar
 */
public class Eva2_Practica4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue myQueue = new MyQueue();
        //FIFO --> FIRST IN, FIRST OUT
        myQueue.agregar(10);//PRIMERO EN LLEGAR, PRIMERO EN SER ATENDIDO
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50);//PRIMERO EN LLAGR, ULTIMO EN SER ATENDIDO
        System.out.println("Primer valor en llegar es " + myQueue.peek());
        myQueue.imprimir();
        try{
            System.out.println("Primer valor en llegar es " + myQueue);
            catch(Exception ex){
                    
            }
            myQueue.imprimir;
        }
    }
    
}


