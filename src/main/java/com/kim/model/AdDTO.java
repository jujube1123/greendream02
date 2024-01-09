package com.kim.model;

public class AdDTO {
	// 최소 온도
	private double mintem;
	// 최대 온도
	private double maxtem;
	// 최소 습도
	private double minhum;
	// 최대 습도
	private double maxhum;
	
	public double getMintem() {
		return mintem;
	}
	public void setMintem(double mintem) {
		this.mintem = mintem;
	}
	public double getMaxtem() {
		return maxtem;
	}
	public void setMaxtem(double maxtem) {
		this.maxtem = maxtem;
	}
	public double getMinhum() {
		return minhum;
	}
	public void setMinhum(double minhum) {
		this.minhum = minhum;
	}
	public double getMaxhum() {
		return maxhum;
	}
	public void setMaxhum(double maxhum) {
		this.maxhum = maxhum;
	}
	
	@Override
	public String toString() {
		return "AdDTO [mintem=" + mintem + ", maxtem=" + maxtem + ", minhum=" + minhum + ", maxhum=" + maxhum + "]";
	}
}
