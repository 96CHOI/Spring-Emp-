package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.EmpService;
import com.dw.emp.vo.EmpVO;

@RestController
public class EmpApiController {
	@Autowired
	EmpService empService;
	
	@GetMapping("/api/v1/emp1")
	public List<EmpVO> callEmp() {
		return empService.selectEmp();
	}
	
	@GetMapping("/api/v1/emp1/{empno}")
	public EmpVO callEmp(@PathVariable int empno) {
		return empService.selectEmpfindByEmpno(empno);
	}
	// 사원추가
	@PostMapping("/api/v1/emp1/join")
	public int callEmpjoin(@RequestBody EmpVO emp) {
		
		return empService.insertEMP(emp);
	}
	// 수정
	@PatchMapping("/api/v1/emp")
	public int callEmpUpdate(@RequestBody EmpVO emp) {
		return empService.updateEMP(emp);
	}
	//삭제
	@DeleteMapping("/api/v1/emp/{empno}")
	public int callEmpDelete(@PathVariable int empno) {
		return empService.deleteEmp(empno);
	}
}
