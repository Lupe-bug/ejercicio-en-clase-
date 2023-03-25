/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;

import java.util.Scanner;
import listas.Lista;
import listas.Nodo;

/**
 *
 * @author barah
 */
public class ListaCancion {
    
    public Nodo primero;
    
    
    public ListaCancion (){
        primero = null;
    }
    
    private int leerEntero(){
        System.out.println("ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
               
    }
    
    public ListaCancion crearLista(){
        String x=0;
        primero =null;
        do{
            x=leerEntero();
            if(x!= -1){
                primero= new Nodo (x,primero);
            }
        } while (x!=-1);
        return this;
    }

}
