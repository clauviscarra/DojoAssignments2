package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething(){
		System.out.println("Gorilla has thrown something, minus 5 energies :(");
		this.energyLevel -= 5;
	
		
	}
	
	public void eatBananas(){
		
		System.out.println("Gorilla is satisfied with yer B-A-N-A-N-A-S, plus 10 energies! :)");
		this.energyLevel += 10;
	}
	
	public void climb(){
		System.out.println("Gorilla has climbed a tree, minus 10 energies :(");
		this.energyLevel -= 10;
	}

}
