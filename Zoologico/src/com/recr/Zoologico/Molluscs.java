package com.recr.Zoologico;

public class Molluscs extends Invertebrate{
	private int tentacles;
	
	 public Molluscs() {
		 
	 }
	 public void Swim() {
		 System.out.println(this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getTentacles()+"\nYears: "+this.getAge()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
		 
	 }
	public int getTentacles() {
		return tentacles;
	}
	public void setTentacles(int tentacles) {
		this.tentacles = tentacles;
	}
	

}
