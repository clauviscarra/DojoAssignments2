package com.codingdojo.objectmaster;

public class Human {
    private String name;
    private int strength;
    private int intelligence;
    private int stealth;
    private int health;

    public Human(){}
    
    public Human(String name){
        this.name = name;
        this.strength = 3;
        this.intelligence = 3;
        this.stealth = 3;
        this.health = 100;
    }

 public void setHealth(int health){
	 this.health = health;
	 }
    
    public int getHealth(){
//    	System.out.println(health);
    	return health;
    	}
    
    public void setName(String name){
    	this.name = name;
    	}
    
    public String getName(){
//    	System.out.println(name);
    	return name;
    	}
    
    public void setStealth(int stealth){
    	this.stealth = stealth;
   	 }
   
    public int getStealth(){
    	return stealth;
    	}
    
    public void setIntelligence(int intelligence){
    	this.intelligence = intelligence;
   	 }
   
    public int getIntelligence(){
    	return intelligence;
    	}
    

    public void attack(Human human){
        human.setHealth(human.getHealth()-strength);
        System.out.println(name+" did attack w strength "+strength+" to this here bish: "+human.getName());
    }
}
