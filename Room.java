/**
 * Eris Suther
 * Feb 15, 2023
 */
package dndProject;

import java.util.List;

//includes rooms and hallways
public class Room extends Area {
	// who is in room
	private List<People> people;

	// all the doors hallways and windows
	private List<Area> entryPoints;

	public Room(boolean discovered, boolean canEnter) {
		super(discovered, canEnter);
	}

	public Room(boolean discovered, boolean canEnter, boolean isLocked) {
		super(discovered, canEnter, isLocked);
	}

	/**
	 * @return the people
	 */
	public List<People> getPeople() {
		return people;
	}

	/**
	 * @param people the people to set
	 */
	public void setPeople(List<People> people) {
		this.people = people;
	}

	/**
	 * @param person the person to add
	 */
	public void addPeople(People person) {
		this.people.add(person);
	}

	/**
	 * @param person the person to remove
	 */
	public void removePeople(People person) {
		this.people.remove(person);
	}

	/**
	 * @return the entryPoints
	 */
	public List<Area> getEntryPoints() {
		return entryPoints;
	}

	/**
	 * @param entryPoints the entryPoints to set
	 */
	public void setEntryPoints(List<Area> entryPoints) {
		this.entryPoints = entryPoints;
	}

	/**
	 * @param entryPoint the entryPoint to add
	 */
	public void addEntryPoint(Area entryPoint) {
		this.entryPoints.add(entryPoint);
	}

	/**
	 * @param entryPoint the entryPoint to remove
	 */
	public void removeEntryPoint(Area entryPoint) {
		this.entryPoints.remove(entryPoint);
	}

}
