/*
 * Author: Austin Lynn User: auslynn
 * Last Updated: 3/4/20
 * Assignment: Lab 7
 */
public class StandardComplex {

	private double realPart;
	private double imaginaryPart;
	
	public StandardComplex(double rPart, double iPart)
	{
		realPart = rPart;
		imaginaryPart = iPart;
	}
	
	public StandardComplex()
	{
		this.realPart = 0;
		this.imaginaryPart = 0;
	}
	
	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	public String toString()
	{
		return "(" +realPart+ ", " +imaginaryPart+ ")";
	}
	
	public StandardComplex getConjugate()
	{
		StandardComplex conjugate = new StandardComplex(realPart, (0 - imaginaryPart));
		return conjugate;
	}
	
	public StandardComplex getStandardComplex()
	{
		StandardComplex coords = new StandardComplex(realPart, imaginaryPart);
		return coords;
	}
	
	public PolarComplex getPolarComplex()
	{
		double amplitude = Math.sqrt((realPart * realPart) + (imaginaryPart * imaginaryPart));
		double angle = Math.atan(imaginaryPart / realPart);
		PolarComplex newCoords = new PolarComplex(amplitude, angle);
		return newCoords;
	}
	
	public boolean isEqual(Object other)
	{
		if(other instanceof PolarComplex || other instanceof StandardComplex)
		{
			if (other instanceof StandardComplex)
			{
				return this.equals(other);
			}
			else if (other instanceof PolarComplex);
			{
				return this.equals(((PolarComplex) other).getStandardComplex());
			}
		}
		else
		{
			return false;
		}
	}
	
	public StandardComplex add(Object other)
	{
		if(other instanceof StandardComplex)
		{
			StandardComplex added = new StandardComplex((this.realPart + ((StandardComplex)other).getRealPart()),(this.imaginaryPart + ((StandardComplex)other).getImaginaryPart()));
			return added;
		}
		else if (other instanceof PolarComplex)
		{
			StandardComplex added = new StandardComplex((this.realPart + ((PolarComplex)other).getStandardComplex().realPart), (this.imaginaryPart + ((PolarComplex)other).getStandardComplex().realPart));
			return added;
		}
		else
		{
			return this.getStandardComplex();
		}
	}
	
	public StandardComplex subtract(Object other)
	{
		if(other instanceof StandardComplex)
		{
			StandardComplex subbed = new StandardComplex((this.realPart - ((StandardComplex)other).getRealPart()),(this.imaginaryPart - ((StandardComplex)other).getImaginaryPart()));
			return subbed;
		}
		else if (other instanceof PolarComplex)
		{
			StandardComplex subbed = new StandardComplex((this.realPart - ((PolarComplex)other).getStandardComplex().realPart), (this.imaginaryPart - ((PolarComplex)other).getStandardComplex().realPart));
			return subbed;
		}
		else
		{
			return this.getStandardComplex();
		}
	}
	
	public StandardComplex multiply(Object other)
	{
		if (other instanceof StandardComplex)
		{
			StandardComplex mult = new StandardComplex(((this.realPart * ((StandardComplex)other).realPart) - (this.imaginaryPart * ((StandardComplex)other).imaginaryPart)), ((this.realPart * ((StandardComplex)other).imaginaryPart) + (this.imaginaryPart * ((StandardComplex)other).realPart)));
			return mult;
		}
		else if (other instanceof PolarComplex)
		{
			StandardComplex mult = new StandardComplex(((this.realPart * ((PolarComplex)other).getStandardComplex().realPart) - (this.imaginaryPart * ((PolarComplex)other).getStandardComplex().imaginaryPart)), ((this.realPart * ((PolarComplex)other).getStandardComplex().imaginaryPart) + ((this.imaginaryPart * ((PolarComplex)other).getStandardComplex().realPart))));
			return mult;
		}
		else
		{
			return this.getStandardComplex();
		}
	}
	
	public StandardComplex divide(Object other)
	{
		if(other instanceof StandardComplex)
		{
			StandardComplex div = new StandardComplex((((this.realPart * ((StandardComplex)other).realPart) + (this.imaginaryPart * ((StandardComplex)other).imaginaryPart)) / ((Math.pow(((StandardComplex)other).realPart, 2) + (Math.pow(((StandardComplex)other).imaginaryPart, 2))))), (((this.imaginaryPart * ((StandardComplex)other).realPart) - (this.realPart * ((StandardComplex)other).imaginaryPart))  / ((Math.pow(((StandardComplex)other).realPart, 2) + (Math.pow(((StandardComplex)other).imaginaryPart, 2))))));
			return div;
		}
		else if(other instanceof PolarComplex)
		{
			StandardComplex div = new StandardComplex((((this.realPart * ((PolarComplex)other).getStandardComplex().realPart) + (this.imaginaryPart * ((PolarComplex)other).getStandardComplex().imaginaryPart)) / ((Math.pow(((StandardComplex)other).realPart, 2) + (Math.pow(((StandardComplex)other).imaginaryPart, 2))))), (((this.imaginaryPart * ((PolarComplex)other).getStandardComplex().realPart) - (this.realPart * ((PolarComplex)other).getStandardComplex().imaginaryPart))  / ((Math.pow(((StandardComplex)other).realPart, 2) + (Math.pow(((StandardComplex)other).imaginaryPart, 2))))));
			return div;
		}
		else
		{
			return this.getStandardComplex();
		}
	}

}
