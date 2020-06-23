package com.recr.Zoologico;

public class Worms extends Invertebrate{
	private String body;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public Worms() {
		
		
	}
	public void Slide() {
		if(body=="sticky") {
			System.out.println(this.getKind()+": "+ this.getName()+"\nBody:"+this.getBody()+"\nYears: "+this.getAge()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
						
		}else if(body=="normal") {
			System.out.println(this.getKind()+": "+ this.getName()+"\nBody:"+this.getBody()+"\nYears: "+this.getAge()+"\nHabit: "+this.getHabit()+ "\nSex:"+this.getSex()+"\nBones: "+this.getBone()+"\nSize:"+this.getSize());
			
		}
	}
}