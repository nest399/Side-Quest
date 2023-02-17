/**
 * Eris Suther
 * Feb 15, 2023
 */
package dndProject;

import java.util.List;

//used for doors and windows but also technically rooms and hallways
public class Area {
	// items
	private List<Item> items;

	// description
	private String description;

	// tasks
	private List<Task> tasks;

	// can you enter and is it locked
	private boolean canEnter;
	private boolean isLocked;

	// has it been discovered yet
	private boolean discovered;

	public Area(boolean discovered, boolean canEnter) {
		this.discovered = discovered;
		this.canEnter = canEnter;
	}

	public Area(boolean discovered, boolean canEnter, boolean isLocked) {
		this.discovered = discovered;
		this.canEnter = canEnter;
		if (this.canEnter == false) {
			this.isLocked = true;
		} else {
			this.isLocked = isLocked;
		}
	}

	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * @param item the item to add
	 */
	public void addItem(Item item) {
		this.items.add(item);
	}

	/**
	 * @param item the item to remove
	 */
	public void removeItem(Item item) {
		this.items.remove(item);
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
	 * @return the tasks
	 */
	public List<Task> getTasks() {
		return tasks;
	}

	/**
	 * @param tasks the tasks to set
	 */
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	/**
	 * @param task the task to add
	 */
	public void addTask(Task task) {
		this.tasks.add(task);
	}

	/**
	 * @param task the task to remove
	 */
	public void removeTask(Task task) {
		this.tasks.remove(task);
	}

	/**
	 * @return the canEnter
	 */
	public boolean canEnter() {
		return canEnter;
	}

	/**
	 * @return the isLocked
	 */
	public boolean isLocked() {
		return isLocked;
	}

	/**
	 * @param isLocked the isLocked to set
	 */
	public void setLocked(boolean isLocked) {
		if (canEnter == false) {
			this.isLocked = true;
		} else {
			this.isLocked = isLocked;
		}
	}

	/**
	 * @return the discovered
	 */
	public boolean isDiscovered() {
		return discovered;
	}

	/**
	 * @param discovered the discovered to set
	 */
	public void setDiscovered(boolean discovered) {
		this.discovered = discovered;
	}

}
