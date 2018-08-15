package com.gloomhaven.components.item;

public class Item
{
	private String description;
	private int itemNumber;
	private boolean isRefreshable;
	
	public Item(String description, int itemNumber, boolean isRefreshable, int max)
	{
		this.description = description;
		this.itemNumber = itemNumber;
		this.isRefreshable = isRefreshable;
	}
}
