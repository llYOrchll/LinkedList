/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.LinkedList;
import java.util.Scanner;

/**
 *
 * @author A13003975
 */
public class Main {
    public static void main(String[] args) {   
        Scanner read = new Scanner(System.in);
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        int opc;
        int value;
        int tamanio;
        
        System.out.println("Menu");
        System.out.println("1.- Ingresar listas.");
        System.out.println("2.- Eliminar elementos repetidos");
        
        System.out.println("Eliga opción: ");
        opc = read.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Ingrese el tamanio de la lista 1: ");
                tamanio = read.nextInt();
                for(int i = 0;i< tamanio;i++){
                    value = read.nextInt();
                    a.addOrder(value);
                }
                
                a.printList();
                
                System.out.println("Ingrese el tamanio de la lista 2: ");
                tamanio = read.nextInt();
                for(int i = 0;i< tamanio;i++){
                    value = read.nextInt();
                    b.addOrder(value);
                }
                b.printList();
                break;
            case 2:
                break;
            default: 
                break;
        }      
    }  
}
