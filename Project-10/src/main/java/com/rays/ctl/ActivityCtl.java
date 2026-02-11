package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ActivityDTO;
import com.rays.form.ActivityForm;
import com.rays.service.ActivityServiceInt;

@RestController
@RequestMapping(value = "Activity")
public class ActivityCtl extends BaseCtl<ActivityForm, ActivityDTO, ActivityServiceInt> {

	@Autowired
	ActivityServiceInt activityService;

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse();
		ActivityDTO dto = new ActivityDTO();
		List<DropdownList> list = activityService.search(dto, userContext);
		res.addResult("activityList", list);

		return res;

	}

}
