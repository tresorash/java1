import champions.Champion;

public class Application {

	public static void main(String[] args) {
		Champion chevalier = new Champion("Chevalier");
		Champion mage = new Champion("Mage");
		Champion archer = new Champion("Archer");
		chevalier.attack(mage);
		System.out.println(mage.getVictory());
		chevalier.attack(mage);
		System.out.println(mage.getVictory());
		chevalier.attack(mage);
		System.out.println(mage.getVictory());
		archer.attack(chevalier);
		System.out.println(chevalier.getVictory());
		archer.attack(chevalier);
		System.out.println(chevalier.getVictory());
		mage.attack(archer);
		System.out.println(archer.getVictory());
		archer.steroid();
		System.out.println(mage.aPerdu());
		chevalier.steroid();
		System.out.println(chevalier.aPerdu());
		chevalier.attack(mage);
		System.out.println(mage.getVictory());
		chevalier.steroid();
		System.out.println(chevalier.aPerdu());
		
		
	}
}
