package com.gloomhaven.components.monster.stats;

import java.util.List;

import com.gloomhaven.constants.Status;

public class Stats {

	private int baseAttack = 0;
	private int baseHealth = 0;
	private int baseMove = 0;
	private int baseRange = 0;
	private int baseRetaliate = 0;
	private int baseShield = 0;
	private List<Status> innateStatuses;
	
	private Stats(Builder builder)
	{
		baseAttack = builder.baseAttack;
		baseHealth = builder.baseHealth;
		baseMove = builder.baseMove;
		baseRange = builder.baseRange;
		baseRetaliate = builder.baseRetaliate;
		baseShield = builder.baseShield;
		innateStatuses = builder.innateStatuses;
	}
	   
	/**
	 * @return base attack
	 */
	public int getBaseAttack()
	{
	    return baseAttack;
	}
	
	/**
	 * @return base Health
	 */
	public int getBaseHealth() {
		return baseHealth;
	}

	/**
	 * @return base move
	 */
	public int getBaseMove() {
		return baseMove;
	}

	/**
	 * @return base range
	 */
	public final int getBaseRange() {
		return baseRange;
	}

	/**
	 * @return base retaliate
	 */
	public final int getBaseRetaliate() {
		return baseRetaliate;
	}

	/**
	 * @return base shield
	 */
	public final int getBaseShield() {
		return baseShield;
	}
	
	/**
	 * @return innate statuses
	 */
	public final List<Status> getInnateStatuses() {
		return innateStatuses;
	}


	public static class Builder {

		private int baseAttack = 0;
		private int baseHealth = 0;
		private int baseMove = 0;
		private int baseRange = 0;
		private int baseRetaliate = 0;
		private int baseShield = 0;
		private List<Status> innateStatuses;
		
		public Builder(int baseAttack, int baseHealth)
		{
			this.baseAttack = baseAttack;
			this.baseHealth = baseHealth;
		}
		
		public Builder baseMove(int baseMove)
		{
			this.baseMove = baseMove;
			return this;
		}
		
		public Builder baseRange(int baseRange)
		{
			this.baseRange = baseRange;
			return this;
		}
		
		public Builder baseRetaliate(int baseRetaliate)
		{
			this.baseRetaliate = baseRetaliate;
			return this;
		}
		
		public Builder baseShield(int baseShield)
		{
			this.baseShield = baseShield;
			return this;
		}
		
		public Builder innateEffects(List<Status> innateStatuses)
		{
			this.innateStatuses = innateStatuses;
			return this;
		}
		public Stats build()
		{
			return new Stats(this);
		}
	}
}
