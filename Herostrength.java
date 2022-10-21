package pbo;

public class Herostrength extends Hero {
	double defense;

	//overriding method
	void display() {
		System.out.println("\nHero Strength");
		System.out.println("Hero name: " + this.name);
		System.out.println("Defense: " + this.defense);
	}



}
