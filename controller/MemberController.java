package com.bitcamp.controller;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

import javax.swing.JOptionPane;

public class MemberController {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		MemberBean member = null;
		
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 \n" 
					+"1.회원가입 \n" 
					+"2.마이페이지 \n" 
					+"3.비번수정 \n" 
					+"4.회원탈퇴\n"
					+"5.목록보기\n"
					+"6.아이디검색")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				String spec = JOptionPane.showInputDialog("이름, 아이디, 비밀번호, 주민번호, 혈액형, 키, 몸무게");
				String[] arr=spec.split(",");
				member = new MemberBean();
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPass(arr[2]);
				member.setSsn(arr[3]);
				member.setBt(arr[4]);
				member.setHeight(Double.parseDouble(arr[5]));
				member.setWeight(Double.parseDouble(arr[6]));
				JOptionPane.showMessageDialog(null, service.join(member));
				break;

			case "2":
				JOptionPane.showMessageDialog(null, service.getMypage(member));
				break;

			case "3":
				
				break;

			case "4":
				
				break;
			case "5" :
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "6":
				String searchId = JOptionPane.showInputDialog("검색 ID");
				member = service.findById(searchId);
				JOptionPane.showMessageDialog(null,member);
				
				break;
			}
		}

	}

}
