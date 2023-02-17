/**
 * Eris Suther
 * Feb 15, 2023
 */
package dndProject;

public class Npc extends People {
	// passive=0 neutral=1 or hostile=2
	private int aggressionLevel;

	// what items can they drop (leave behind, give to player, if unconcious, if
	// killed, if pickpocketed)
	// give item to the player
	// private List<Item> giveToPlayer;

	// role (guard, worker, boss, civilian, prisoner, npc teammate)

	// how familiar are they with player? (changes dialogue and how interactions go)
	private double friendshipLevel;

	// are they aware of the player
	private boolean awareOfPlayer;

	// what is dialogue when talked to?
	// what is reaction when player tries to fight?
	// if not passive what is reaction when fighting?
	// what is reaction when notice player?
	// can they help the player?
	// willing to travel alongside the player?

	public Npc(int aggressionLevel) {
		super();
		this.setAggressionLevel(aggressionLevel);
		this.setFriendshipLevel(0);
		this.setAwareOfPlayer(false);
	}

	public Npc(String name, double attack, double defense, double perception, double stealth, double totalHealth,
			int aggressionLevel) {
		super(name, attack, defense, perception, stealth, totalHealth);
		this.setAggressionLevel(aggressionLevel);
		this.setFriendshipLevel(0);
		this.setAwareOfPlayer(false);
	}

	public Npc(String name, double attack, double defense, double perception, double stealth, double totalHealth,
			int aggressionLevel, double friendshipLevel) {
		super(name, attack, defense, perception, stealth, totalHealth);
		this.setAggressionLevel(aggressionLevel);
		this.setFriendshipLevel(friendshipLevel);
		this.setAwareOfPlayer(false);
	}

	/**
	 * @return the aggressionLevel
	 */
	public int getAggressionLevel() {
		return aggressionLevel;
	}

	/**
	 * @param aggressionLevel the aggressionLevel to set
	 */
	public void setAggressionLevel(int aggressionLevel) {
		this.aggressionLevel = aggressionLevel;
	}

	/**
	 * @return the friendshipLevel
	 */
	public double getFriendshipLevel() {
		return friendshipLevel;
	}

	/**
	 * @param friendshipLevel the friendshipLevel to set
	 */
	public void setFriendshipLevel(double friendshipLevel) {
		this.friendshipLevel = friendshipLevel;
	}

	/**
	 * @param friendship the friendship to increase the friendshipLevel
	 */
	public void increaseFriendshipLevel(double friendship) {
		this.friendshipLevel += friendship;
	}

	/**
	 * @param friendship the friendship to decrease the friendshipLevel
	 */
	public void decreaseFriendshipLevel(double friendship) {
		this.friendshipLevel -= friendship;
	}

	/**
	 * @return the awareOfPlayer
	 */
	public boolean isAwareOfPlayer() {
		return awareOfPlayer;
	}

	/**
	 * @param awareOfPlayer the awareOfPlayer to set
	 */
	public void setAwareOfPlayer(boolean awareOfPlayer) {
		this.awareOfPlayer = awareOfPlayer;
	}

}
