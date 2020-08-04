package Main.service;

import java.util.Collection;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;

public class MemberListPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer
	}
	public void printAll() {
		Collection<MemberDTO> lists = memberDao.selectAll();
		System.out.println("珥� �쉶�썝 �닔�뒗 : " + lists.size());
		for(MemberDTO dto :lists ) {
			printer.print(dto);
		}
	}
}
