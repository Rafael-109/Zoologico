package com.recr.Zoologico;

public class Fish extends Vertebrate{
	private int gills;
	private int fins;
	
	public Fish() {
		
	}
	public void Swim() {
		if(gills>=1&&fins>=2) {
			System.out.println(this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getFins()+"\nYears: "+this.getAge()+"\nEyes:"+this.getEyes()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
		}
	}
	public int getFins() {
		return fins;
	}
	public void setFins(int fins) {
		this.fins = fins;
	}
	public int getGills() {
		return gills;
	}
	public void setGills(int gills) {
		this.gills = gills;
	}
}
