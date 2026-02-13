package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.SupportDTO;
import com.rays.form.SupportForm;
import com.rays.service.SupportServiceInt;


@RestController
@RequestMapping(value = "Support")
public class SupportCtl extends BaseCtl<SupportForm, SupportDTO, SupportServiceInt> {

	@Autowired
	SupportServiceInt supportService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		SupportDTO dto = new SupportDTO();
		List<DropdownList> list = supportService.search(dto, userContext);
		res.addResult("supportList", list);
		return res;
	}

}
