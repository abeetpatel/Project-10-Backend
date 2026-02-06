package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.common.attachment.AttachmentForm;
import com.rays.dto.AttendanceDTO;
import com.rays.form.AttendanceFrom;
import com.rays.service.AttendanceServiceInt;

@RestController
@RequestMapping(value = "Attendance")
public class AttendanceCtl extends BaseCtl<AttendanceFrom, AttendanceDTO, AttendanceServiceInt> {	
	
	@Autowired
	AttendanceServiceInt attendanceService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		AttendanceDTO dto = new AttendanceDTO();
		List<DropdownList> list = attendanceService.search(dto, userContext);
		res.addResult("attendanceList", list);
		return res;
	}

}
