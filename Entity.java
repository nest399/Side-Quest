/**
 * Eris Suther
 * Mar 9, 2023
 */
package entities;

import java.util.List;

import items_and_areas.Item;

public class Entity {
	// character info (name, description, stats, health)
	private String name;
	private String description;
	private double attack;
	private double defense;
	private double perception;
	private double stealth;
	private double totalHealth;
	private double currentHealth;

	// what items do they have
	private List<Item> bag;

	// what is their weapon
	private Item weapon;

	// description can change as injured

	public Entity() {
		setName("???");
		setDescription(null);
		setAttack(5);
		setDefense(5);
		setPerception(5);
		setStealth(5);
		setTotalHealth(25);
		setCurrentHealth(25);
	}

	public Entity(String name, double attack, double defense, double perception, double stealth, double totalHealth) {
		this.setName(name);
		this.setDescription(null);
		this.setAttack(attack);
		this.setDefense(defense);
		this.setPerception(perception);
		this.setStealth(stealth);
		this.setTotalHealth(totalHealth);
		this.setCurrentHealth(totalHealth);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the attack
	 */
	public double getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(double attack) {
		this.attack = attack;
	}

	/**
	 * @return the defense
	 */
	public double getDefense() {
		return defense;
	}

	/**
	 * @param defense the defense to set
	 */
	public void setDefense(double defense) {
		this.defense = defense;
	}

	/**
	 * @return the perception
	 */
	public double getPerception() {
		return perception;
	}

	/**
	 * @param perception the perception to set
	 */
	public void setPerception(double perception) {
		this.perception = perception;
	}

	/**
	 * @return the stealth
	 */
	public double getStealth() {
		return stealth;
	}

	/**
	 * @param stealth the stealth to set
	 */
	public void setStealth(double stealth) {
		this.stealth = stealth;
	}

	/**
	 * @return the totalHealth
	 */
	public double getTotalHealth() {
		return totalHealth;
	}

	/**
	 * @param totalHealth the totalHealth to set
	 */
	private void setTotalHealth(double totalHealth) {
		this.totalHealth = totalHealth;
	}

	/**
	 * @return the currentHealth
	 */
	public double getCurrentHealth() {
		return currentHealth;
	}

	/**
	 * @param currentHealth the currentHealth to set
	 */
	public void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
	}

	/**
	 * @return the bag
	 */
	public List<Item> getBag() {
		return bag;
	}

	/**
	 * @param bag the bag to set
	 */
	public void setBag(List<Item> bag) {
		this.bag = bag;
	}

	/**
	 * @param item to add to bag
	 */
	public void addItemToBag(Item item) {
		bag.add(item);
	}

	/**
	 * @param item to remove from bag
	 */
	public void removeItemFromBag(Item item) {
		bag.remove(item);
	}

	/**
	 * @return the weapon
	 */
	public Item getWeapon() {
		return weapon;
	}

	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}
}