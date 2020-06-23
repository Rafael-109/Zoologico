package com.recr.Zoologico;

public class Amphibians extends Vertebrate{
private int extremities;
private String kind;

public Amphibians() {
	
}
public void Jump() {
	if(extremities>0) {
		System.out.println("This"+this.getName()+"Jump" );
		System.out.println(this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getExtremities()+"\nYears: "+this.getAge()+"\nEyes:"+this.getEyes()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
	}
		
	
}
public int getExtremities() {
	return extremities;
}
public void setExtremities(int extremities) {
	this.extremities = extremities;
}
public String getKind() {
	return kind;
}
public void setKind(String kind) {
	this.kind = kind;
}
}
