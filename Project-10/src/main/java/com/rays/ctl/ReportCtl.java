package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ReportDTO;
import com.rays.form.ReportForm;
import com.rays.service.ReportServiceInt;

@RestController
@RequestMapping(value = "Report")
public class ReportCtl extends BaseCtl<ReportForm, ReportDTO, ReportServiceInt> {

	@Autowired
	ReportServiceInt reportService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		ReportDTO dto = new ReportDTO();
		List<DropdownList> list = reportService.search(dto, userContext);
		res.addResult("ReportList", list);
		return res;
	}

}
