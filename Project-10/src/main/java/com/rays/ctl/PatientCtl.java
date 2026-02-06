package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.PatientDTO;
import com.rays.form.PatientForm;
import com.rays.service.PatientServiceInt;

@RestController
@RequestMapping(value = "Patient")
public class PatientCtl extends BaseCtl<PatientForm, PatientDTO, PatientServiceInt>{

	
}
