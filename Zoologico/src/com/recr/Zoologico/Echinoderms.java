package com.recr.Zoologico;

public class Echinoderms extends Invertebrate{
private int extremities;

public Echinoderms() {
	
}

public void Swim() {
	if(extremities>=1) {
		 System.out.println(this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getExtremities()+"\nYears: "+this.getAge()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
	}
}
public int getExtremities() {
	return extremities;
}

public void setExtremities(int extremities) {
	this.extremities = extremities;
}



}
