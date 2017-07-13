package com.clau.teamroaster.models;

import java.util.Random;

public class Team {
	
	String name;
	String id;

	public Team() {
	
	}
	
	public int rndNum(){
		return new Random().nextInt(100) +1;
	}
	
	public Team(String name) {
		this.name = name;
		this.id = Integer.toString(rndNum());
	}

}
