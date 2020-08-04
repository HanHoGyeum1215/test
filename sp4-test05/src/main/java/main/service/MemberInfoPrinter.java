package Main.service;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;

public class MemberInfoPrinter {
	private MemberDao memberDao = new MemberDao();
	private MemberPrinter printer = new MemberPrinter();
	//�쓽議닿컼泥� 二쇱엯 ; Dependency injection
	public void setMemberDao() {
		this.memberDao = memberDao;
	}
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	public void printMemberInfo(String email) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if(dto == null) {
			System.out.println("占쎈쑓占쎌뵠占쎄숲 占쎈씨占쎌벉\n");
			return;
		}
		printer.print(dto);
	}
}
