package com.trevin.FleetMangmt.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class JobTitleController {
	@GetMapping("/jobtitles")
	public String getJobtitles(){

		return "jobTitle";
	}
}
