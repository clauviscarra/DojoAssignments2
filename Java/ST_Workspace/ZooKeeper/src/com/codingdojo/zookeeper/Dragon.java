package com.codingdojo.zookeeper;

public class Dragon extends Mammal {
	public int energyLevel = 500;
	
	public int displayEnergy(){
		System.out.println(energyLevel);
		return energyLevel;
	}
	
	public void fly(){
		System.out.println("PFPFpfpfpf *flyyying dragon noise*");
		energyLevel -=  50;
	}
	
	public void eatHumans(){
		energyLevel += 25;
		System.out.println("You ate a hooman (0.0)");
	}
	
	public void attackTown(){
		System.out.println("sound of town burning");
		energyLevel -= 100;
	}


}
