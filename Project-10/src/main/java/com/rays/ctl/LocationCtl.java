package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.LocationDTO;
import com.rays.form.LocationForm;
import com.rays.service.LocationServiceInt;

@RestController
@RequestMapping(value = "Location")
public class LocationCtl extends BaseCtl<LocationForm, LocationDTO, LocationServiceInt> {

	@Autowired
	LocationServiceInt locattionService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		LocationDTO dto = new LocationDTO();
		List<DropdownList> list = locattionService.search(dto, userContext);
		res.addResult("locationList", list);
		return res;
	}

}
