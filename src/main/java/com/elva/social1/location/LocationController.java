package com.elva.social1.location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// step #1, 2 @RestController  -> step #3 @Controller

//@RestController

// step #3
@Controller
public class LocationController {

	@Autowired
	private LocationService locationService;

// step #1, 2
//	@RequestMapping(value="/locations")
//	public List<Location> getAllLocations(){
//		return locationService.getAllLocations();
//	}
	
	
// step #3
	@RequestMapping(value="/locations")
	public String getAllLocations(Model model){
		
		//List<Location> locations = locationService.getAllLocations();
		
		model.addAttribute("locations", locationService.getAllLocations());
		return "locations" ;
	}

	
	
// step #1
//	@RequestMapping(value="/locations/{id}")
//	public Location getLocation(@PathVariable String id) {
//		return locationService.getLocation(id);
//	}

	
	
// step #2
	@RequestMapping(value="/locations/{id}")
	public Optional<Location> getLocation(@PathVariable String id){
		return locationService.getLocation(id);
	}
	
	
	
	@RequestMapping(value="/locations", method=RequestMethod.POST)
	public void addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
	}
	
	@RequestMapping(value="/locations/{id}", method=RequestMethod.DELETE)
	public void deleteLocation(@PathVariable String id) {
		locationService.deleteLocation(id);
	}
	
	@RequestMapping(value="/locations/{id}", method = RequestMethod.PUT)
	public void updateLocation(@PathVariable String id, @RequestBody Location location) {
		locationService.updateLocation(id, location);
	}
	
	@RequestMapping(value="/locations/name/{names}")
	public List<Location> getLocationByName(@PathVariable String name){
		return locationService.getLocationByName(name);
			
	}
}
