package com.trevin.FleetMangmt.controllers;

import java.util.Optional;

import com.trevin.FleetMangmt.models.VehicleType;
import com.trevin.FleetMangmt.services.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class VehicleTypeController {
	

	//Get All VehicleTypes
	@GetMapping("/vehicletypes")
	public String getVehicleTypes(){

		return "vehicleType";
	}

	}



