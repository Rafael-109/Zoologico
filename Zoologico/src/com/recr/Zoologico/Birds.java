package com.recr.Zoologico;

public class Birds extends Vertebrate implements Walks{
	private String pico;


public String getPico() {
		return pico;
	}
	public void setPico(String pico) {
		this.pico = pico;
	}

public Birds() {
	
}
public void Fly() {
	if(getKind()!="Penguin") {
		System.out.println("\nThis "+this.getKind()+" fly" );
		
	}else if(getKind()=="Penguin") {
		System.out.println("\nThis "+this.getKind()+"Dosen't fly" );
		
	}
}

@Override
public void Walk() {
	if(getExtremities()>=0) {
		
	
	System.out.println(this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getExtremities()+"\nYears: "+this.getAge()+"\nEyes:"+this.getEyes()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize()+"\nPico"+this.getPico());
}
	}
}




