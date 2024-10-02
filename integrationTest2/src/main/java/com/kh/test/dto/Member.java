package com.kh.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private int memberNo;
	private String name; // memberName -> name 수정
	private String address; // memberId -> address 수정
	private String age; // memberPassword -> age 수정
	
}