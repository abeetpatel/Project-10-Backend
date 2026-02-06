package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.DocumentDTO;
import com.rays.dto.VehicalDTO;
import com.rays.form.DocumentForm;
import com.rays.service.DocumentServiceInt;
import com.rays.service.VehicalServiceInt;

@RestController
@RequestMapping(value = "Document")
public class DocumentCtl extends BaseCtl<DocumentForm, DocumentDTO, DocumentServiceInt> {

	@Autowired
	DocumentServiceInt documentService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		DocumentDTO dto = new DocumentDTO();
		List<DropdownList> list = documentService.search(dto, userContext);
		res.addResult("documentList", list);
		return res;
	}

}
