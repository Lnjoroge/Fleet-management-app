package com.trevin.FleetMangmt.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class VehicleMaintenanceController {

	@GetMapping("/vehiclemaintinances")
	public String getVehicleMaintinance(){
		return "vehicleMaintinance";
	}
}
