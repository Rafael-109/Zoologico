package com.recr.Zoologico;

public class Mammals extends Vertebrate implements Walks{
	
	private int lungs;
	private int extremities;
	private String Kind;
	 
	public void Walk() {
		if(lungs>0) {
			System.out.println(this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getExtremities()+"\nYears: "+this.getAge()+"\nEyes:"+this.getEyes()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
		}else if(lungs==0) {
			System.out.println("Doesn't live");
		}
	}

	public int getlungs(int i) {
		return lungs;
	}

	public void setlungs(int lungs) {
		this.lungs = lungs;
	}

	public int getExtremities() {
		return extremities;
	}

	public void setExtremities(int extremities) {
		this.extremities = extremities;
	}

	public String getKind() {
		return Kind;
	}

	public void setKind(String kind) {
		Kind = kind;
	}


}
