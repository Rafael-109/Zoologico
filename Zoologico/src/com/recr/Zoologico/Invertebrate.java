package com.recr.Zoologico;

public abstract class Invertebrate extends Animals {
private int bone;
private String Kind;
 
public int getBone() {
	return bone;
}

public void setBone(int bone) {
	this.bone = bone;
}

public void Slide() {
	if(bone==0) {
		System.out.println("This Animal Slide");
		
	}else if(bone>=0) {
		System.out.println("This in not Invertebrate");
	}
	
}

public String getKind() {
	return Kind;
}

public void setKind(String kind) {
	Kind = kind;
}

}
