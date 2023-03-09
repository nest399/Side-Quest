/**
 * Eris Suther
 * Mar 9, 2023
 */
package entities;

import java.util.List;

import items_and_areas.Task;

public class Player extends Entity {
	// xp and level (need level*5 to level up and when do get 0.1 more of a stat of
	// choice)
	private int level;
	private int xp;

	// tasks completed and in progress
	private List<Task> tasksCompleted;
	private List<Task> tasksInProgress;

	// who is on their team
	private List<Entity> team;

	// backstory? age? pronouns? notes?

	public Player() {
		super();
		setLevel(1);
		setXp(0);
	}

	public Player(String name, double attack, double defense, double perception, double stealth, double totalHealth) {
		super(name, attack, defense, perception, stealth, totalHealth);
		setLevel(1);
		setXp(0);
	}

	public Player(String name, double attack, double defense, double perception, double stealth, double totalHealth,
			int level) {
		super(name, attack, defense, perception, stealth, totalHealth);
		this.setLevel(level);
		this.setXp(0);

	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the xp
	 */
	public int getXp() {
		return xp;
	}

	/**
	 * @param xp the xp to set
	 */
	private void setXp(int xp) {
		this.xp = xp;
	}

	/**
	 * @param xp the xp to add
	 */
	public void addXp(int xp) {
		this.xp += xp;
		while (this.xp >= (level * 5)) {
			this.xp -= (level * 5);
			level++;
		}
	}

	/**
	 * @return the tasksCompleted
	 */
	public List<Task> getTasksCompleted() {
		return tasksCompleted;
	}

	/**
	 * @param completedTask the completedTask to add to tasksCompleted
	 */
	public void addCompletedTask(Task completedTask) {
		tasksCompleted.add(completedTask);
	}

	/**
	 * @return the tasksInProgress
	 */
	public List<Task> getTasksInProgress() {
		return tasksInProgress;
	}

	/**
	 * @param inProgressTask the inProgressTask to add to tasksInProgress
	 */
	public void addInProgressTask(Task inProgressTask) {
		tasksInProgress.add(inProgressTask);
	}

	/**
	 * @param inProgressTask the inProgressTask to remove from tasksInProgress
	 */
	public void removeInProgressTask(Task inProgressTask) {
		tasksInProgress.remove(inProgressTask);
	}

	/**
	 * @return the team
	 */
	public List<Entity> getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(List<Entity> team) {
		this.team = team;
	}

	/**
	 * @param teammate the teammate to add to team
	 */
	public void addTeammate(Entity teammate) {
		team.add(teammate);
	}

	/**
	 * @param teammate the teammate to remove from team
	 */
	public void removeTeammate(Entity teammate) {
		team.remove(teammate);
	}
}