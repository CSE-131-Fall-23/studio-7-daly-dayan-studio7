package studio7;

class Die
{
	private int sides;
	
	/**
	 * Constructs the Die object
	 * 
	 * @param initSides the initial number of sides
	 */
	public Die(int initSides)
	{
		sides = initSides;
	}
	
	/**
	 * Rolls the die and returns a number in the range [1, sides]
	 * 
	 * @return the result of the die roll
	 */
	public int rollDie()
	{
		return((int)(Math.random()*sides+1));
	}
}
