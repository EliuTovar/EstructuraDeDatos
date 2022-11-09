package eva2_practica7_collections;

import java.util.ArrayList;
import java.util.LinkedList;


public class Eva2_Practica7_Collections {

    
    public static void main(String[] args) {
        LinkedList<String> listaEnlazada = new LinkedList();
        listaEnlazada.add("Hola");
        listaEnlazada.add(" ");
        listaEnlazada.add("Mundo");
        listaEnlazada.add("!!");
        System.out.println(listaEnlazada);
        System.out.println(listaEnlazada.get(0));
        listaEnlazada.remove(0);
        System.out.println(listaEnlazada);
        listaEnlazada.addFirst("Hola");
        System.out.println(listaEnlazada);
        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.println(listaEnlazada.get(i) + " ");}
        
        //ARRAYLIST
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        System.out.println("");
        System.out.println("ARRAY LIST--------------------------------");
        System.out.println(arrayList);
        arrayList.add(2, 250);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + " ");
            
        }
        
        //QUEUES
            
        }
        
    }
    

