package app;

/**
 * The Game class simulates a game scenario with different weapons being activated and fired.
 */
public class Game {
	
	/**
	 * Fires the given weapon by activating and firing it with a power of 5.
	 * @param weapon The weapon to be fired.
	 */
	private static void fireWeapon(WeaponInterface weapon) {
		if (weapon instanceof Bomb)
			System.out.println("--------> I am a Bomb");
		
		weapon.activate(true);
		weapon.fireWeapon(5);
	}

	/**
	 * The main method is the entry point of the program.
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		// Create an array of WeaponInterface and initialize to specific Weapon of Bomb and Gun
		WeaponInterface[] weapons = new WeaponInterface[2];
		weapons[0] = new Bomb();
		weapons[1] = new Gun();
		
		// For all Weapons fire them
		for(int x=0; x < weapons.length; ++x) {
			fireWeapon(weapons[x]);
		}
	}
}
