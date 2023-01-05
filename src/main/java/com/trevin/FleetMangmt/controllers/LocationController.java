package com.trevin.FleetMangmt.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LocationController {
	@GetMapping("/locations")
	public String getLocations(){

		return "location";
	}
}