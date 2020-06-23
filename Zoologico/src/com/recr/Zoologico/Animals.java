package com.recr.Zoologico;

public class Animals {
	
	protected String name;
	protected String habit;
	protected String size;
	protected String sex;
	protected int age;
		
	public Animals() {
		//System.out.println("All Animals are alive");
	}
	public void Eat(String string) {
		if(age>0) {
			System.out.println("Kind "+string);
		}
	}
	public void Sleep(String duerme) {
		if(age>0) {
			System.out.println("The animal sleep");
		}
	} 
	public void Sound(String sonido) {
		if(age>0) {
			System.out.println("The Animal sound is:"+sonido);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHabit() {
		return habit;
	}
	public void setHabit(String habit) {
		this.habit = habit;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String string) {
		this.size = string;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
