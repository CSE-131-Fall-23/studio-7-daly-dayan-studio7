package studio7;

class Complex
{
	private double real;
	private double imaginary;
	
	/**
	 * Constructs the Complex object
	 * 
	 * @param initReal the initial real component
	 * @param initImaginary the initial imaginary component
	 */
	public Complex(double initReal, double initImaginary)
	{
		real = initReal;
		imaginary = initImaginary;
	}
	
	/**
	 * Returns the real component of the Complex object
	 * 
	 * @return the real component of the Complex object
	 */
	public double getReal()
	{
		return(real);
	}
	
	/**
	 * Returns the imaginary component of the Complex object
	 * 
	 * @return the imaginary component of the Complex object
	 */
	public double getImaginary()
	{
		return(imaginary);
	}
	
	/**
	 * Returns the sum of two Complex objects
	 * 
	 * @param B the Complex number to be added to
	 * @return the sum of two complex numbers
	 */
	public Complex addingComplex(Complex B)
	{
		Complex sum = new Complex(real+B.getReal(), imaginary+B.getImaginary());
		return(sum);
	}
	
	/**
	 * Returns the product of two Complex objects
	 * 
	 * @param B the Complex number to be multiplied to
	 * @return the product of two complex numbers
	 */
	public Complex multiplyingComplex(Complex B)
	{
		double realProduct = (real*B.getReal())-(imaginary*B.getImaginary());
		double imaginaryProduct = (real*B.getImaginary())+(imaginary*B.getReal());
		Complex product = new Complex(realProduct, imaginaryProduct);
		return(product);
	}
}
