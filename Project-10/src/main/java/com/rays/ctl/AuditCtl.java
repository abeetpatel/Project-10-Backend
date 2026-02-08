package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.AuditDTO;
import com.rays.form.AuditForm;
import com.rays.service.AuditServiceInt;

@RestController
@RequestMapping(value = "Audit")
public class AuditCtl extends BaseCtl<AuditForm, AuditDTO, AuditServiceInt> {

	@Autowired
	AuditServiceInt auditService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		AuditDTO dto = new AuditDTO();
		List<DropdownList> list = auditService.search(dto, userContext);
		res.addResult("auditList", list);
		return res;
	}

}
