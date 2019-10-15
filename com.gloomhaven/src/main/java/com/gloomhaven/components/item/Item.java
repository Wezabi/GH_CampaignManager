package com.gloomhaven.components.item;

/**
 * <p>
 * An item class.
 * </p>
 * <p>
 * Copyright &copy 2018
 * </p>
 *
 * @author Wes Huhman
 */
public class Item
{
	private String description;
	private int itemNumber;
	private boolean isRefreshable;
	private int ID;
	private int max;
	
	/**
     * Constructs a new {@link Item}.
     * 
     * @param description
     * 			the item description
     * @param itemNumber
     *			the item number
     * @param isRefreshable 
     * 			{@code true} if the item can be refreshed, otherwise {@code false}
     * @param ID
     * 			the item ID
     * @param max
     * 			the maximum number of the item
     */
	public Item(String description, int itemNumber, boolean isRefreshable, int ID, int max)
	{
		this.description = description;
		this.itemNumber = itemNumber;
		this.isRefreshable = isRefreshable;
		this.ID = ID;
		this.max = max;
	}
}
