package Main.service;

import java.util.Date;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;
import main.DTO.RegisterRequest;

public class MemberRegisterService {
	// �쓽議� 媛앹껜
	private MemberDao memberDao;
	//의존객체 주입 : Dependency injection
	public MemberRegisterService(memberDao memberDao) {
		this.memberDao = memberDao;
	}
	public void regist(RegisterRequest req) {
		MemberDTO dto = memberDao.selectByEmail(req.getEmail());
		if(dto == null) {
			dto = new MemberDTO();
			dto.setEmail(req.getEmail());
			dto.setName(req.getName());
			dto.setPassword(req.getPassword());
			dto.setRegisterDate(new Date());
			memberDao.insert(dto);
			System.out.println("�궗�슜�옄 �벑濡앹씠 �셿猷� �릺�뿀�뒿�땲�떎.");
		}else {
			System.out.println("以묐났 �궗�슜�옄�엯�땲�떎.");
		}		
	}
}
