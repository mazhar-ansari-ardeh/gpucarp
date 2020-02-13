package util.random;

import org.apache.commons.math3.random.RandomDataGenerator;

public class NormalSampler extends AbstractRealSampler implements Cloneable {

	private double mean;
	private double sd;

	public NormalSampler() {
		super();
	}

	public NormalSampler(double mean, double sd) {
		super();
		this.mean = mean;
		this.sd = sd;
	}

	public void set(double mean, double sd) {
		this.mean = mean;
		this.sd = sd;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	public void setSd(double sd) {
		this.sd = sd;
	}

	public double getMean() {
		return mean;
	}

	public double getSd() {
		return sd;
	}

	@Override
	public double next(RandomDataGenerator rdg) {
		return rdg.nextGaussian(mean, sd);
	}

	@Override
	public void setLower(double lower) {
		// do nothing.

	}

	@Override
	public void setUpper(double upper) {
		// do nothing.

	}

	@Override
	public NormalSampler clone()
	{
//		try
//		{
		NormalSampler retval = (NormalSampler) super.clone();
		return retval;
//		} catch (CloneNotSupportedException e)
//		{
//			e.printStackTrace();
//			throw new RuntimeException(e); // This should not happen.
//		}
	}
}
