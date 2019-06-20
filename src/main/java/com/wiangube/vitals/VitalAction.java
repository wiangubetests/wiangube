package com.wiangube.vitals;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class VitalAction {
	
	@RequestMapping("/breathing")
	public boolean breathingVital(@RequestParam(value = "status", defaultValue = "true") Boolean breathing) {
		Vital vital = new Vital();
		
		return vital.getBreathing();
	}
	
	@RequestMapping(value = "/reanimate", method = RequestMethod.POST)
	public Vital reanimate(@RequestBody Vital inputPayload) {
		Vital reanimate = new Vital();
		reanimate.setBreathing(true);
		
		return reanimate;
	}
	
	@RequestMapping(value = "/clean", method = RequestMethod.POST)
	public Vital clean(@RequestBody Vital inputPayload) {
		Vital clean = new Vital();
		clean.setClean(true);
		clean.setBreathing(true);
		
		return clean;
	}
	
	@RequestMapping(value = "/breastfeed", method = RequestMethod.POST)
	public Vital breastfeed(@RequestBody Vital inputPayload) {
		Vital breastfeed = new Vital();
		breastfeed.setHungry(false);
		breastfeed.setClean(true);
		breastfeed.setBreathing(true);
		
		return breastfeed;
	}
}