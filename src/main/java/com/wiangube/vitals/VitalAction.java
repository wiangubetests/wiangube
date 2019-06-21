package com.wiangube.vitals;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class VitalAction {
	
	//Checks if William Antonio is currently breathing
	@RequestMapping("/breathing")
	public boolean breathingVital(@RequestParam(value = "status", defaultValue = "true") Boolean breathing) {
		Vital vital = new Vital();
		
		return vital.getBreathing();
	}
	
	//If William Antonio is not currently breathing, try to reanimate him
	@RequestMapping(value = "/reanimate", method = RequestMethod.POST)
	public Vital reanimate(@RequestBody Vital inputPayload) {
		Vital reanimate = new Vital();
		
		if (!reanimate.getBreathing()) {
			reanimate.setBreathing(true);
		}
		
		return reanimate;
	}
	
	//If William Antonio is dirty, clean him
	@RequestMapping(value = "/clean", method = RequestMethod.POST)
	public Vital clean(@RequestBody Vital inputPayload) {
		Vital clean = new Vital();
		
		if (!clean.getClean()) {
			clean.setClean(true);
		}
		
		if (!clean.getBreathing()) {
			clean.setBreathing(true);
		}
		
		return clean;
	}
	
	//If William Antonio is hungry, feed him
	@RequestMapping(value = "/breastfeed", method = RequestMethod.POST)
	public Vital breastfeed(@RequestBody Vital inputPayload) {
		Vital breastfeed = new Vital();
		
		if (!breastfeed.getHungry()) {
			breastfeed.setHungry(false);
		}
		
		if (!breastfeed.getClean()) {
			breastfeed.setClean(true);
		}
		
		if (!breastfeed.getBreathing()) {
			breastfeed.setBreathing(true);
		}
		
		return breastfeed;
	}
}