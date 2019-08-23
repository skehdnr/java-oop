package com.bitcamp.services;

import com.bitcamp.domains.MemberBean;

/**
 * 요구사항(기능정의) 
 * <사용자기능>
 *  1.회원가입
 *  2.마이페이지 
 *  3.비번 수정
 *  4.회원 탈퇴
 *  5.아이디 존재 체크
 *  6.로그인
 *  ********** 
 *  <관리자기능> 
 * 1.회원목록
 * 2.아이디검색
 * 3.이름검색
 * 4.전체 회원수
 */
public class MemberService {
	private MemberBean[] members;
	private int count;

	public MemberService() {
		members = new MemberBean[3];
		count = 0;
	}
	/******************************************************************************************
	 * 사용자 기능
	 * ****************************************************************************************/
	/*
	 * 1.회원가입
	 */
	public String join(MemberBean param) {
		String msg = "회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}

	/*
	 * 2.마이페이지
	 */
	public String getMypage(MemberBean param) {
		String msg = "마이페이지";

		return param.toString();
	}

	/*
	 * 3.비번수정 (Id ,기존 비밀번호, 신규비밀번호를 입력 받아서 기존비밀번호를 체크후 일치하면 신규비밀번호로 변경 )
	 * 비밀번호 변경후 로그인을 실행해서 새로 바뀐 비밀번호로 로그인성공, 예전비번은 로그인실패
	 */
	public String changePass(MemberBean param) {
		String msg = "비밀번호가 변경 되었습니다";
		String id = param.getId();
		String pass = param.getPass();
		
		String [] newPass =pass.split(",");
		String oldPass = newPass[0];
		String nP = newPass[1];
		for(int i = 0; i<count;i++) {
			if(param.getId().equals(members[i].getId())
					&&(oldPass.equals(members[i].getPass()))){
				members[i].setPass(nP);
				break;
			}
	}return msg;
	}
	/*
	 * 4.회원탈퇴
	 */
	public String withdrawal(MemberBean param) {
		String msg = "회원탈퇴 완료";
		return msg;
	}
	/*
	 * 5.아이디체크
	 * */
	public String existId(String id) {
		String msg = "가입가능 ID 입니다";
		// 가입가능한 아이디 입니다.
		for(int i =0; i<count;i++) {
			if(id.equals(members[i].getId())) {
				msg = "이미 존재하는 ID 입니다";
				break;
			}
		}
		return msg;
	}
	/*
	 * 6.로그인 (파라미터로 id 와 pass 만 입력받은 상태)
	 * */
	public String login(MemberBean param) {
		String msg = "로그인 실패";
		for(int i = 0; i<count;i++) {
		if(param.getId().equals(members[i].getId())
				&&(param.getPass().equals(members[i].getPass()))){
			msg = "로그인 성공";
			break;
		}
		}return msg;
	}
	
	
/******************************************************************************************
 * 관리자 기능
 * ****************************************************************************************/
	/*
	 * 회원목록
	 */
	public String list() {
		String msg = "";
		for (int i = 0; i < count; i++) {
			msg += members[i].toString() + ", \n";
		}
		return msg;
	}
	/*
	 * 아이디검색
	 */
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if(id.equals(members[i].getId())) {
				member = members[i];
			}break;
		}
		return member;
	}
	/*이름검색
	 * */
	public MemberBean [] findByName(String name) {
		int j = 0;
		for(int i = 0; i<count; i++) {
			if(name.equals(this.members[i].getName())) {
				j++;
			}
		}
		MemberBean[] members = new MemberBean[j];
		j = 0 ;
		for(int i = 0; i<count; i++) {
			if(name.equals(this.members[i].getName())) {
				members[j] = this.members[i];
				j++;
				if(members.length==j) {
					break;
				}
			}members[i] = this.members[i];
		}
		return members;
	}
	/*4.전체 회원수
	 * */
	public String countAll() {
		return String.valueOf(count+"명 입니다");
	}

}
