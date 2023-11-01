package studio7;

class Fraction
{
	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator)
	{
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	public int getNumerator()
	{
		return(numerator);
	}
	
	public int getDenominator()
	{
		return(denominator);
	}
	
	public Fraction addFractions(Fraction B)
	{
		Fraction A = new Fraction(numerator, denominator);
		Fraction multiplierA = new Fraction(denominator, denominator);
		Fraction multiplierB = new Fraction(B.getDenominator(), B.getDenominator());
		Fraction productA = multiplierA.multiplyFractions(B);
		Fraction productB = multiplierB.multiplyFractions(A);
		Fraction sum = new Fraction (productA.getNumerator()+productB.getNumerator(), productB.getDenominator());
		return(sum);
	}
	
	public Fraction multiplyFractions(Fraction B)
	{
		int productNumerator = numerator*B.getNumerator();
		int productDenominator = denominator*B.getDenominator();
		Fraction product = new Fraction(productNumerator, productDenominator);
		return(product);
	}
	
	public Fraction reciprocal()
	{
		Fraction inverse = new Fraction(denominator, numerator);
		return(inverse);
	}
	
	public Fraction simplify()
	{
		int i = 2;
		int newNumerator = numerator;
		int newDenominator = denominator;
		while(i < numerator && i < denominator)
		{
			if(numerator % i == 0 && denominator % i == 0)
			{
				newNumerator = newNumerator/i;
				newDenominator = newDenominator/i;
			}
			i++;
		}
		Fraction simplified = new Fraction(newNumerator, newDenominator);
		return(simplified);
	}
}
