package com.recr.Zoologico;

public class Vertebrate extends Animals {
	
	protected int bone;
	protected int eyes;
	protected String kind;
	protected int extremities;

	public Vertebrate() {
		//System.out.println("Kind: Vertebrate");
	}

	public int getBone() {
		return bone;
	}

	public void setBone(int bone) {
		this.bone = bone;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
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
