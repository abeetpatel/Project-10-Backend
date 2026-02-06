package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ReportDTO;
import com.rays.dto.VehicalDTO;
import com.rays.form.VehicalForm;
import com.rays.service.VehicalServiceInt;

@RestController
@RequestMapping(value = "Vehical")
public class VehicalCtl extends BaseCtl<VehicalForm, VehicalDTO, VehicalServiceInt> {

	@Autowired
	VehicalServiceInt vehicalService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		VehicalDTO dto = new VehicalDTO();
		List<DropdownList> list = vehicalService.search(dto, userContext);
		res.addResult("vehicalList", list);
		return res;
	}

}
