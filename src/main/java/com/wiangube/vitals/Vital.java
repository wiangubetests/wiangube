package com.wiangube.vitals;

public class Vital {
	private boolean breathing = false;
	private boolean clean;
	private boolean hungry;
	
	//Find out if William Antonio is breathing or not
	public boolean getBreathing() {
		return this.breathing;
	}

	//Help William Antonio to breath again
	public void setBreathing(boolean breathing) {
		this.breathing = breathing;
	}
	
	//Find out if William Antonio is clean or not
	public boolean getClean() {
		return this.clean;
	}

	//Help William Antonio to stay clean again
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	
	//Find out if William Antonio is hungry or not
	public boolean getHungry() {
		return this.hungry;
	}

	//Help William Antonio to eat something
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
}
