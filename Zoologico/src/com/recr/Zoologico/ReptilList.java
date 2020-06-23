package com.recr.Zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReptilList {

	private List<Reptil> listaReptil;

	public ReptilList() {
		this.listaReptil = new ArrayList<Reptil>();
	}
	

	// Metodo para agregar un reptil
	public void addReptil() {
				
		Scanner sn = new Scanner(System.in);
		Reptil nuevoRep ;
		
        System.out.println("Kind?: (1.Snake / 2.Crocodile / 3.Dragon) ");
        int getKind = sn.nextInt();

        
        // OBTENTO LOS DATOS
        System.out.println("Fangs: ");
        int fangs = sn.nextInt();
        
        System.out.println("extremities: ");
        int extremities = sn.nextInt();
        
        System.out.println("bone: ");
        int bone = sn.nextInt();
        
        System.out.println("eyes: ");
        int  eyes = sn.nextInt();
        
        System.out.println("name: ");
        sn.nextLine();
        String name = sn.nextLine();
        
        System.out.println("habit: ");
        String habit = sn.nextLine();

        System.out.println("size: ");
        String size = sn.nextLine();

        System.out.println("sex: ");
        String sex = sn.nextLine();

        System.out.println("age: ");
        int age = sn.nextInt();
        
        // Agrega un Snake
        if(getKind == 1) {            
    		nuevoRep = new Reptil(fangs, extremities, "Snake", bone, eyes, name, habit,size, sex, age) ;
    		listaReptil.add(nuevoRep);    		

            System.out.println("Saved!");
        }

        // Agrega un Crocodile
        if(getKind == 2) {            
    		nuevoRep = new Reptil(fangs, extremities, "Crocodile", bone, eyes, name, habit,size, sex, age) ;
    		listaReptil.add(nuevoRep);    		

            System.out.println("Saved!");
        }
        
        // Agrega un Dragon
        if(getKind == 3) {
    		nuevoRep = new Reptil(fangs, extremities, "Dragon", bone, eyes, name, habit,size, sex, age) ;
    		listaReptil.add(nuevoRep);
    		
            System.out.println("Saved!");
        }
        
		
	}
	
	// Metodo para mostrar animales almacenados
	public void showAnimals() {

		Scanner sn = new Scanner(System.in);

        System.out.println("Kind?: (1.Snake / 2.Crocodile / 3.Dragon / 4. All) ");
        int getKind = sn.nextInt();
        
        // Muestra un Snake
        if(getKind == 1) {
        	
        	for(int i=0; i<listaReptil.size(); i++) {
        		
        		// SOLO voy a mostrar los animales que sean del tipo = SNAKE
        		if(listaReptil.get(i).getKind().equals("Snake")) {
        			listaReptil.get(i).Walk();		// Imprimo en pantalla        			
        		}
        	}
        }

        // Muestra un Crocodile
        else if(getKind == 2) {
        	
        	for(int i=0; i<listaReptil.size(); i++) {
        		
        		// SOLO voy a mostrar los animales que sean del tipo = SNAKE
        		if(listaReptil.get(i).getKind().equals("Crocodile")) {
        			listaReptil.get(i).Walk();		// Imprimo en pantalla        			
        		}
        	}
        }
        
        // Muestra un Dragon
        else if(getKind == 3) {
        	
        	for(int i=0; i<listaReptil.size(); i++) {
        		
        		// SOLO voy a mostrar los animales que sean del tipo = SNAKE
        		if(listaReptil.get(i).getKind().equals("Dragon")) {
        			listaReptil.get(i).Walk();		// Imprimo en pantalla        			
        		}
        	}
        }

        // Muestra todos los Reptiles
        else if(getKind == 4) {
        	for(int i=0; i<listaReptil.size(); i++) {
        			listaReptil.get(i).Walk();		// Imprimo en pantalla    
        	}
        }
		
	}

}
