/*
 * Author: Austin Lynn User: auslynn
 * Last Updated: 3/4/20
 * Assignment: Lab 7
 */
public class PolarComplex {

	private double amplitude;
	private double angle;
	
	public PolarComplex(double amp, double ang)
	{
		amplitude = amp;
		angle = ang;
	}
	
	public PolarComplex() 
	{
		this.amplitude = 0;
		this.angle = 0;
	}

	public double getAmplitude() {
		return amplitude;
	}

	public void setAmplitude(double amplitude) {
		this.amplitude = amplitude;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public String toString()
	{
		return "(" +amplitude+ ", " +angle+ ")";
	}
	
	public PolarComplex getConjugate()
	{
		PolarComplex conjugate = new PolarComplex(amplitude, (0 - angle));
		return conjugate;
	}
	
	public PolarComplex getPolarComplex()
	{
		PolarComplex coords = new PolarComplex(amplitude, angle);
		return coords;
	}
	
	public StandardComplex getStandardComplex()
	{
		double realPart = amplitude * Math.sin(angle);
		double imaginaryPart = amplitude * Math.cos(angle);
		StandardComplex newCoords = new StandardComplex(realPart, imaginaryPart);
		return newCoords;
	}

	public boolean isEqual(Object other)
	{
		if(other instanceof PolarComplex || other instanceof StandardComplex)
		{
			if (other instanceof StandardComplex)
			{
				return this.getPolarComplex().equals(((StandardComplex) other).getPolarComplex());
			}
			else if (other instanceof PolarComplex);
			{
				return this.getPolarComplex().equals(other);
			}
		}
		else
		{
			return false;
		}
	}
	
	public PolarComplex add(Object other)
	{
		if(other instanceof PolarComplex)
		{
			PolarComplex added = new PolarComplex((this.amplitude + ((PolarComplex)other).getAmplitude()),(this.angle + ((PolarComplex)other).getAngle()));
			return added;
		}
		else if(other instanceof StandardComplex)
		{
			PolarComplex added = new PolarComplex((this.amplitude + ((StandardComplex)other).getPolarComplex().amplitude), (this.angle + ((StandardComplex)other).getPolarComplex().angle));
			return added;
		}
		else
		{
			return this.getPolarComplex();
		}
	}
	
	public PolarComplex sub(Object other)
	{
		if(other instanceof PolarComplex)
		{
			PolarComplex subbed = new PolarComplex((this.amplitude - ((PolarComplex)other).getAmplitude()),(this.angle - ((PolarComplex)other).getAngle()));
			return subbed;
		}
		else if(other instanceof StandardComplex)
		{
			PolarComplex subbed = new PolarComplex((this.amplitude - ((StandardComplex)other).getPolarComplex().amplitude), (this.angle - ((StandardComplex)other).getPolarComplex().angle));
			return subbed;
		}
		else
		{
			return this.getPolarComplex();
		}
	}
	
	public PolarComplex multiply(Object other)
	{
		if (other instanceof PolarComplex)
		{
			PolarComplex mult = new PolarComplex(((this.amplitude * ((PolarComplex)other).amplitude) - (this.angle * ((PolarComplex)other).angle)), ((this.amplitude * ((PolarComplex)other).angle) + (this.angle * ((PolarComplex)other).amplitude)));
			return mult;
		}
		else if (other instanceof StandardComplex)
		{
			PolarComplex mult = new PolarComplex(((this.amplitude * ((StandardComplex)other).getPolarComplex().amplitude) - (this.angle * ((StandardComplex)other).getPolarComplex().angle)), ((this.amplitude * ((StandardComplex)other).getPolarComplex().angle) + ((this.angle * ((StandardComplex)other).getPolarComplex().amplitude))));
			return mult;
		}
		else
		{
			return this.getPolarComplex();
		}
	}

}
