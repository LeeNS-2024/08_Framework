package com.kh.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.test.service.EmployeeService;

@Mapper
public interface EmployeeMapper {

	List<EmployeeService> selectAllList();

}
