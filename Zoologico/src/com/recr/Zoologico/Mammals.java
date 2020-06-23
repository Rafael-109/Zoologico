package com.recr.Zoologico;

public class Mammals extends Vertebrate implements Walks{
	
	private int lugs;
	private int extremities;
	private String Kind;
	 
	public void Walk() {
		if(lugs>0) {
			System.out.println(this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getExtremities()+"\nYears: "+this.getAge()+"\nEyes:"+this.getEyes()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
		}else if(lugs==0) {
			System.out.println("Dosen't live");
		}
	}

	public int getLugs(int i) {
		return lugs;
	}

	public void setLugs(int lugs) {
		this.lugs = lugs;
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
