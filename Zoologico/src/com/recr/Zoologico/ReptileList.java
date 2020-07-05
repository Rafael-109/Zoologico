package com.recr.Zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReptileList {

	private List<Reptile> listaReptile;

	public ReptileList() {
		this.listaReptile = new ArrayList<Reptile>();              

		Reptile Snake= new Reptile();
        Snake.setKind("Snake"); Snake.setName("Sass"); Snake.setAge(12);
        Snake.setExtremities(0);Snake.setFangs(2);Snake.setEyes(2);Snake.setSize("2 m");
        Snake.setHabit("Earth");Snake.setSex("Male");Snake.setBone(450);

        listaReptile.add(Snake);

        Reptile Coco= new Reptile();
        Coco.setKind("crocodile"); Coco.setName("Cookie");Coco.setAge(5);
        Coco.setExtremities(4);Coco.setFangs(8);Coco.setEyes(2);Coco.setSize("3 m");
        Coco.setHabit("Earth and Water");Coco.setSex("Female");Coco.setBone(650);

        listaReptile.add(Coco);

        Reptile Drag= new Reptile();
        Drag.setKind("Dragon"); Drag.setName("Oso");Drag.setAge(7);
        Drag.setExtremities(4);Drag.setFangs(8);Drag.setEyes(2);Drag.setSize("3 m");
        Drag.setHabit("Earth and Water");Drag.setSex("Male");Drag.setBone(650);
        listaReptile.add(Drag);
	}
	

	
	public void addReptile() {
				
		Scanner sn = new Scanner(System.in);
		Reptile nuevoRep ;
		
        System.out.println("Kind?: (1.Snake / 2.Crocodile / 3.Dragon) ");
        int getKind = sn.nextInt();

        
  
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
        
      
        if(getKind == 1) {            
    		nuevoRep = new Reptile(fangs, extremities, "Snake", bone, eyes, name, habit,size, sex, age) ;
    		listaReptile.add(nuevoRep);    		

            System.out.println("Saved!");
        }

    
        if(getKind == 2) {            
    		nuevoRep = new Reptile(fangs, extremities, "Crocodile", bone, eyes, name, habit,size, sex, age) ;
    		listaReptile.add(nuevoRep);    		

            System.out.println("Saved!");
        }
        
      
        if(getKind == 3) {
    		nuevoRep = new Reptile(fangs, extremities, "Dragon", bone, eyes, name, habit,size, sex, age) ;
    		listaReptile.add(nuevoRep);
    		
            System.out.println("Saved!");
        }
        
		
	}
	
	
	public void showAnimals() {

		Scanner sn = new Scanner(System.in);

        System.out.println("Kind?: (1.Snake / 2.Crocodile / 3.Dragon / 4. All) ");
        int getKind = sn.nextInt();
        
       
        if(getKind == 1) {
        	
        	for(int i=0; i<listaReptile.size(); i++) {
        		
        
        		if(listaReptile.get(i).getKind().equals("Snake")) {
        			listaReptile.get(i).Walk();		       			
        		}
        	}
        }


        else if(getKind == 2) {
        	
        	for(int i=0; i<listaReptile.size(); i++) {
        		
        	
        		if(listaReptile.get(i).getKind().equals("Crocodile")) {
        			listaReptile.get(i).Walk();		      			
        		}
        	}
        }
        

        else if(getKind == 3) {
        	
        	for(int i=0; i<listaReptile.size(); i++) {
        		
        		
        		if(listaReptile.get(i).getKind().equals("Dragon")) {
        			listaReptile.get(i).Walk();		      			
        		}
        	}
        }

      
        else if(getKind == 4) {
        	for(int i=0; i<listaReptile.size(); i++) {
        			listaReptile.get(i).Walk();		  
        	}
        }
		
	}

}
