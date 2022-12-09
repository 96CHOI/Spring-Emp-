package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.EmpVO;

@Controller
public class EmpController {
	@GetMapping("/emp1")
	public String callempPage() {

		return "emp";
	}
	
	
	
}
