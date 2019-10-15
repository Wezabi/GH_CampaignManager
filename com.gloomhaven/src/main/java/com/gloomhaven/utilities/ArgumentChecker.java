package com.gloomhaven.utilities;

public class ArgumentChecker {

	private ArgumentChecker() {}
	
	public static String rejectIfNullOrEmpty(String argument, String name)
	{
		if(argument.length() == 0)
		{
			throw new IllegalArgumentException(String.format("%s cannot be empty", name));
		}
		return argument;
	}
	
	public static <T> T rejectIfNull(T argument, String name)
	{
		if(argument == null)
		{
			throw new IllegalArgumentException(String.format("%s cannot be null", name));
		}
		return argument;
	}
	
	public static int rejectIfNonPositive(int argument, String name)
	{
		if(argument < 1)
		{
			throw new IllegalArgumentException(String.format("%s is not positive", name));
		}
		return argument;
	}
}
