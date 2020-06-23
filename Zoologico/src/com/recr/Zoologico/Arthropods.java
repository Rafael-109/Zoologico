package com.recr.Zoologico;

	public class Arthropods extends Invertebrate implements Walks{
		private int extremities;
		private int eyes;

			public Arthropods() {
				
			}
			
			@Override
			public void Walk() {
				if(extremities>1) {
					System.out.println(this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getExtremities()+"\nYears: "+this.getAge()+"\nEyes:"+this.getEyes()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
					
				}
			}

			public int getExtremities() {
				return extremities;
			}

			public void setExtremities(int extremities) {
				this.extremities = extremities;
			}

			public int getEyes() {
				return eyes;
			}

			public void setEyes(int eyes) {
				this.eyes = eyes;
			}
			

		}

