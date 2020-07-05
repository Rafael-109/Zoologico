package com.recr.Zoologico;

public class Birds extends Vertebrate implements Walks{
	private String beak;


public String getbeak() {
		return beak;
	}
	public void setbeak(String beak) {
		this.beak = beak;
	}

public Birds() {
	
}
public void Fly() {
	if(getKind()!="Penguin") {
		System.out.println("\nThis "+this.getKind()+" fly" );
		
	}else if(getKind()=="Penguin") {
		System.out.println("\nThis "+this.getKind()+"Doesn't fly" );
		
	}
}

@Override
public void Walk() {
	if(getExtremities()>=0) {
		
	
	System.out.println(this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getExtremities()+"\nYears: "+this.getAge()+"\nEyes:"+this.getEyes()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize()+"\nbeak"+this.getbeak());
}
	}
}




