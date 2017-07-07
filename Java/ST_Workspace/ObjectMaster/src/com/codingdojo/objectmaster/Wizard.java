package com.codingdojo.objectmaster;

public class Wizard extends Human {
	public Wizard(){
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public Wizard(String name){
		super(name);
	}
	
	public void heal(Human human){
		human.setHealth(human.getHealth()+this.getIntelligence());
		System.out.println(this.getName() + " has healed " + human.getName());
	}
	
	public void fireball(Human human){
		human.setHealth(human.getHealth()-this.getIntelligence()*3);
		System.out.println(this.getName()+ " threw a fireball at " + human.getName());
	}
	
}
