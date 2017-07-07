package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args){
        Wizard tim  = new Wizard("Tim");
        Human will = new Human("Will");
        Ninja marco = new Ninja("Marco");
        Samurai minh = new Samurai("Minh");
        Samurai dan = new Samurai("Dan");
        
       tim.attack(will);
       tim.fireball(will);
       marco.steal(tim);
       minh.deathBlow(tim);
       
       System.out.println(Samurai.howMany());

    }

}
