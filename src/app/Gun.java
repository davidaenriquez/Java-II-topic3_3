package app;

/**
 * The Gun class implements the WeaponInterface and represents a gun weapon.
 */
public class Gun implements WeaponInterface {
	
	/**
	 * Fires the gun with a specified power.
	 * @param power The power of the gun when fired.
	 */
	@Override
	public void fireWeapon(int power) {
		System.out.println("In Gun.fireWeapon() with a power of " + power);
	}
	
	/**
	 * Fires the gun (overloaded method).
	 */
	@Override
	public void fireWeapon() {
		System.out.println("In overloaded Gun.fireWeapon()");	
	}

	/**
	 * Activates or deactivates the gun based on the given enable parameter.
	 * @param enable True to activate, false to deactivate the gun.
	 */
	@Override
	public void activate(boolean enable) {
		System.out.println("In the Gun.activate() with an enable of " + enable);		
	}
}
 