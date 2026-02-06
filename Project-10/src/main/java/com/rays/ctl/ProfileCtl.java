package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ProfileDTO;
import com.rays.form.ProfileForm;
import com.rays.service.ProfileServiceInt;

@RestController
@RequestMapping(value = "Profile")
public class ProfileCtl extends BaseCtl<ProfileForm, ProfileDTO, ProfileServiceInt>{
	
	@Autowired
	ProfileServiceInt profileService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		ProfileDTO dto = new ProfileDTO();
		List<DropdownList> list = profileService.search(dto, userContext);
		res.addResult("profileList", list);
		return res;
	}

}
