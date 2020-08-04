package main.service;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;

public class ChangePasswordService {
private MemberDao memberDao = new MemberDao();
public void setMemberDao(MemberDao memberDao) {
	this.memberDao = memberDao;
}
public void changePassword(String email, String oldpw,
		String newPw	) {
	
	MemberDTO dto = memberDao.selectByEmail(email);
	if(dto == null) {
		System.out.println("�씠硫붿씪�씠 議댁옱�븯吏� �븡�뒿�땲�떎");
		return;
	}
	dto.changePassword(oldPw, newPw);
	memberDao.update(dto);
}
}
