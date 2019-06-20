package com.wiangube.vitals;

public class Vital {
	private boolean breathing = false;
	private boolean clean;
	private boolean hungry;
	
	public boolean getBreathing() {
		return this.breathing;
	}

	public void setBreathing(boolean breathing) {
		this.breathing = breathing;
	}
	
	public boolean getClean() {
		return this.clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}
	
	public boolean getHungry() {
		return this.hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
}
