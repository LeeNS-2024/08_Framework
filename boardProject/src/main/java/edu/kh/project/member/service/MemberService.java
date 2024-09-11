package edu.kh.project.member.service;

import edu.kh.project.member.dto.Member;

public interface MemberService {

	/** 로그인 서비스
	 * @param memberEmail
	 * @param memberPw
	 * @return lohinMember 또는 null(eamil 또는 pw 불일치)
	 */
	Member login(String memberEmail, String memberPw);

}
