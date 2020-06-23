package com.recr.Zoologico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
        
        boolean primerIngreso = true;
        
        String rutaActual = "0";
        
        OpcionesMenuPpal menuPpal = new OpcionesMenuPpal();
        MisMenues controller = new MisMenues();
        
        
        // Mientras el usuario no seleccione la opcion "Exit" desde el menu Ppal
        while (salir != true)
		{
        	// EJECUTO EL MENU SOLO CUANDO INICIO LA PRIMERA VEZ
        	if (primerIngreso == true) {
            	menuPpal.options();	 // Muestro el menu ppal
                System.out.println("Welcome to the Zoo.");
                
                primerIngreso = false;        		
        	}        	

        	try {
                System.out.println("\n Seleccione la opcion deseada: ");
	    		opcion = sn.nextInt();		// capturo la opcion ingresada por el usuario
	
	            // VALIDO QUE NO SEA 1 ó 0 (que el usuario no elija la opcion 0-Back ó 1-Exit)                
	    		if(opcion > 1) {
            	
                    rutaActual = rutaActual + Integer.toString(opcion);	 // hago un APPEND a la ruta existente
                    //System.out.println("Ruta actual:"+  rutaActual);
                    
                    
                    controller.seleccionOpcion(rutaActual); // Y llamo a mi controlador para que muestre por pantalla el menu correspondiente                	
                }    		
	    		
	    		// Si elijo salir del juego
	            else if (opcion == 1)  salir = true; 
	            
	            // Si el usuario decidio volver para atras (0-back)
	            else if (opcion == 0) {
	            	
	            	// Le saco el ultimo numero a mi cadena de ruta
	            	rutaActual = rutaActual.substring(0, rutaActual.length()-1);
	            	
		            //System.out.println("\n Ruta nueeva: "+ rutaActual.substring(0, rutaActual.length()-1));

                    controller.seleccionOpcion(rutaActual); // Y llamo a mi controlador para que muestre por pantalla el menu correspondiente   
	            }
        	}
        	
        	catch (InputMismatchException e) {
		            System.out.println("Debes insertar un número\n");
		            sn.next();
                }
		}
        
        System.out.println("\nGracias por jugar!");        
        
	}
}
