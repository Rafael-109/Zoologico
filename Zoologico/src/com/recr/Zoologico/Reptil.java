package com.recr.Zoologico;


public class Reptil extends Vertebrate implements Walks{
	
		private int fangs;
		private int extremities;
		private String kind;		

		public Reptil(int fangs, int extremities,  String kind, int bone, int eyes,  String name, String habit, String size, String sex, int age) {
			this.fangs = fangs;
			this.extremities = extremities;
			this.kind = kind;
			this.bone = bone;
			this.eyes = eyes;
			this.name = name;
			this.habit = habit;
			this.size = size;
			this.sex = sex;
			this.age = age;
		}

		public void Walk() {
			if(extremities==4) {
				System.out.println("\n" + this.getKind()+": "+ this.getName()+"\nExtremities:"+this.getExtremities()+"\nYears: "+this.getAge()+ "\nFangs: "+this.getFangs()+"\nEyes:"+this.getEyes()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
			}else if(extremities==0) {
				
				System.out.println("\n" + this.getKind()+": "+ this.getName()+"\nYears: "+this.getAge()+ "\nFangs: "+this.getFangs()+"\nEyes:"+this.getEyes()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
			}
			else {
				System.out.println("Not valid");
			}
			
		}		
		
		public int getFangs() {
			return fangs;
		}

		public void setFangs(int i) {
			this.fangs = i;
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
