package pbo;


public class Mainovr {
    public static void main(String[] args) {
	System.out.println("===Overriding method1===");
	Hero hero1 = new Hero();
	hero1.name = "Luffy";
	hero1.display();

	Herostrength hero2 = new Herostrength();
	hero2.name = "Zoro";
	hero2.defense = 100;
	hero2.display();

	System.out.println("\n===overriding method2===");
	Tumbuhan tumbuhan1 = new Tumbuhan();
	tumbuhan1.name = "Pohon";
	tumbuhan1.age = 10;
	tumbuhan1.display();

	Pohon pohon1 = new Pohon();
	pohon1.name = "Kelapa";
	pohon1.age = 10;
	pohon1.height = 100;
	pohon1.display();

    }
}
