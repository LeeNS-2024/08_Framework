package com.kh.test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.test.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("employee")
public class EmployeeController {
	
	private final EmployeeService service;
	
	@ResponseBody
	@GetMapping("selectAllList")
	public List<EmployeeService> selectAllList(){
		return service.selectAllList();
	}

}
