/**
 * Eris Suther
 * Mar 9, 2023
 */
package items_and_areas;

import java.util.List;

import entities.Entity;

//includes rooms and hallways
public class Room extends Area {
	// who is in room
	private List<Entity> entities;

	// all the doors hallways and windows
	private List<Area> entryPoints;

	public Room(boolean discovered, boolean canEnter) {
		super(discovered, canEnter);
	}

	public Room(boolean discovered, boolean canEnter, boolean isLocked) {
		super(discovered, canEnter, isLocked);
	}

	/**
	 * @return entities in the room
	 */
	public List<Entity> getEntities() {
		return entities;
	}

	/**
	 * @param entities the entities to set
	 */
	public void setEntity(List<Entity> entity) {
		this.entities = entity;
	}

	/**
	 * @param entity the entity to add
	 */
	public void addEntity(Entity entity) {
		this.entities.add(entity);
	}

	/**
	 * @param entity the entity to remove
	 */
	public void removeEntity(Entity entity) {
		this.entities.remove(entity);
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