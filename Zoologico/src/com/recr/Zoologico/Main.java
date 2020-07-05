package com.recr.Zoologico;

import java.util.InputMismatchException;
import java.util.ArrayList;


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
        
        
     
        while (salir != true)
		{
     
        	if (primerIngreso == true) {
            	menuPpal.options();	
                System.out.println("Welcome to the Zoo.");
                
                primerIngreso = false;        		
        	}        	

        	try {
                System.out.println("\n Choose Option: ");
	    		opcion = sn.nextInt();		
	
	                         
	    		if(opcion > 1) {
            	
                    rutaActual = rutaActual + Integer.toString(opcion);	 
                
                    
                    
                    controller.seleccionOpcion(rutaActual);                	
                }    		
	    		
	    	
	            else if (opcion == 1)  salir = true; 
	       
	            else if (opcion == 0) {
	            	
	            	
	            	rutaActual = rutaActual.substring(0, rutaActual.length()-1);
	            	
		       

                    controller.seleccionOpcion(rutaActual);  
	            }
        	}
        	
        	catch (InputMismatchException e) {
		            System.out.println("Insert Number\n");
		            sn.next();
                }
		}
        
        System.out.println("\nThanks for playing!");        
        
	}
}
