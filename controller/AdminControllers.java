package com.bitcamp.controller;
import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;
public class AdminControllers {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		MemberBean member = null;
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n" 
					+"1.회원목록 \n" 
					+"2.아이디검색 \n" 
					+"3.이름검색 \n" 
					+"4.전체 회원수\n")){
			case "0" : 
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "2" :
				String searchId = JOptionPane.showInputDialog("검색 ID");
				JOptionPane.showMessageDialog(null,service.findById(searchId));
				break;
			case "3" : 
				String searchName = JOptionPane.showInputDialog("검색이름");
				JOptionPane.showMessageDialog(null, service.findByName(searchName));
				break;
			case"4" :
				JOptionPane.showMessageDialog(null, service.countAll());			
				break;
			}
		}
	}

}
