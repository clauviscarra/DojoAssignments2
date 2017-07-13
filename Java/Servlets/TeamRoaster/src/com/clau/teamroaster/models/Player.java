package com.clau.teamroaster.models;

public class Player {
	
	String name;
	String last_name;
	String age;
	int count;

	public Player() {
	}
	
	public Player(String name, String last_name, String age){
		this.name = name;
		this.last_name = last_name;
		this.age = age;
		
		count++;
		
	}
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public String getName(){
		
		return name;
	}

}
