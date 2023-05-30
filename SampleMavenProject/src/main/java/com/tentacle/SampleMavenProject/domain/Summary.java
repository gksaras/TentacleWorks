package com.tentacle.SampleMavenProject.domain;

public class Summary { 

	private double sum;
	private double max;
	private double min;
	private double avg;
	
	public Summary(double sum,double max,double min,double avg) {
		this.sum = sum;
		this.max = max;
		this.min = min;
		this.avg = avg;
	}
	
	public double getSum() {
		return sum;
	}
	
	public double getMax() {
		return max;
	}
	
	public double getMin() {
		return min;
	}
	
	public double getAvg() {
		return avg;
	}
}
