package app;

/**
 * The Bomb class implements the WeaponInterface and represents a bomb weapon.
 */
public class Bomb implements WeaponInterface {
	
	/**
	 * Fires the bomb with a specified power.
	 * @param power The power of the bomb when fired.
	 */
	@Override
	public void fireWeapon(int power) {
		System.out.println("In Bomb.fireWeapon() with a power of " + power);
	}
	
	/**
	 * Fires the bomb (overloaded method).
	 */
	@Override
	public void fireWeapon() {
		System.out.println("In overloaded Bomb.fireWeapon()");
	}

	/**
	 * Activates or deactivates the bomb based on the given enable parameter.
	 * @param enable True to activate, false to deactivate the bomb.
	 */
	@Override
	public void activate(boolean enable) {
		System.out.println("In the Bomb.activate() with an enable of " + enable);		
	}
}
