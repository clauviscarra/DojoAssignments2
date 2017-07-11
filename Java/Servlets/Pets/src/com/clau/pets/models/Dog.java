package com.clau.pets.models;

public class Dog extends Animal {
	
	public Dog(){}
	
	public Dog(String name, String breed, double weight){
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
		
	}

	@Override
	public String showAffection() {
		if(this.getWeight() >= 30){
			return this.getName() + " curled up next to you and was super annoying.";
			
		}else if (this.getWeight() < 30){
			return this.getName() + " hopped on your lap and slobbered erwhere.";
			
		}
		return "";
	}

}
