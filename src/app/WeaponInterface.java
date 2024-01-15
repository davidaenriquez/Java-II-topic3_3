package app;

/**
 * The WeaponInterface represents an interface for various weapons.
 */
public interface WeaponInterface {
	
	/**
	 * Fires the weapon.
	 */
	public void fireWeapon();
	
	/**
	 * Fires the weapon with a specified power.
	 * @param power The power level at which to fire the weapon.
	 */
	public void fireWeapon(int power);
	
	/**
	 * Activates or deactivates the weapon based on the given enable parameter.
	 * @param enable true to activate, false to deactivate.
	 */
	public void activate(boolean enable);
}
