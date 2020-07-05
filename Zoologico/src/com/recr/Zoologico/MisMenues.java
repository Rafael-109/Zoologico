package com.recr.Zoologico;

public class MisMenues {

    private OpcionesMenuPpal menuPpal = new OpcionesMenuPpal();
    ReptileList ReptileList = new ReptileList();
    
	

	public void seleccionOpcion(String rutaActual) {

		if(rutaActual.equals("0")) {
			menuPpal.options();
		}		
        
		else if(rutaActual.equals("02")) {
	        System.out.println("\nVertebrate");  
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit\n"); 
	        
	        System.out.println("2.Reptile");
	        System.out.println("3.Mammals");
	        System.out.println("4.Birds");
	        System.out.println("5.Fish");
	        System.out.println("6.Amphibians");
		}
		
		
		else if(rutaActual.equals("022")) {
	        System.out.println("\nReptilees:"); 
            System.out.println("Snake");
            System.out.println("Crocodile");
            System.out.println("Dragon");
            
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit"); 
            System.out.println("2.Add");
            System.out.println("3.Show animals");
		}
		
				
				else if(rutaActual.equals("0222")) {
			        System.out.println("\nAdd Reptilees");
			        ReptileList.addReptile();
			        
		
		            System.out.println("Use 0 to go to the previous menu");
				}
				
				
				else if(rutaActual.equals("0223")) {
			        System.out.println("\nShow Reptilees");
			        ReptileList.showAnimals();
			        
		
		            System.out.println("Use 0 to go to the previous menu");
				}
				
		
		

	
		else if(rutaActual.equals("023")) {
	        System.out.println("\nMammals"); 	        
            System.out.println("Whale");
            System.out.println("Dog");
            System.out.println("Horse");
            
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit"); 
            System.out.println("2.Add");
            System.out.println("3.Show animals");
		}
		
		
		else if(rutaActual.equals("024")) {
	        System.out.println("\nBirds"); 
            System.out.println("Penguin");
            System.out.println("Chicken");
            System.out.println("Dove");
            
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit"); 
            System.out.println("2.Add");
            System.out.println("3.Show animals");
		}
		
	
		else if(rutaActual.equals("025")) {
	        System.out.println("\nFish"); 
            System.out.println("Catfish");
            System.out.println("Shark");
            System.out.println("Fish");
            
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit"); 
            System.out.println("2.Add");
            System.out.println("3.Show animals");
		}
		
		
		else if(rutaActual.equals("026")) {
	        System.out.println("\nAmphibians"); 
            System.out.println("Frog");
            
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit"); 
            System.out.println("2.Add");
            System.out.println("3.Show animals");
		}
				


		else if(rutaActual.equals("03")) {
	        System.out.println("\nInvertebrate"); 
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit\n"); 
            
            System.out.println("2.Arthropods");
            System.out.println("3.Echinoderms");
            System.out.println("4.Molluscs");
            System.out.println("5.Worms");
		}
		

	
		else if(rutaActual.equals("032")) {
	        System.out.println("\nArthropods"); 
	        
            System.out.println("Ant");
            System.out.println("Spider");
            
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit"); 
            System.out.println("2.Add");
            System.out.println("3.Show animals");
		}

		
		else if(rutaActual.equals("033")) {
	        System.out.println("\nEchinoderms"); 
            
            System.out.println("Crab");
            
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit"); 
            System.out.println("2.Add");
            System.out.println("3.Show animals");
		}		

		
		else if(rutaActual.equals("034")) {
	        System.out.println("\nMolluscs"); 
	        
            System.out.println("Octopus");
            
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit"); 
            System.out.println("2.Add");
            System.out.println("3.Show animals");
		}

	
		else if(rutaActual.equals("035")) {
	        System.out.println("\nWorms"); 
	        
            System.out.println("Worm");
            
	        System.out.println("\n0.Back");  
	        System.out.println("1.Exit"); 
            System.out.println("2.Add");
            System.out.println("3.Show animals");
		}
		
		
		else {
	        System.out.println("\nSelect an option");
		}
		
	}
}
