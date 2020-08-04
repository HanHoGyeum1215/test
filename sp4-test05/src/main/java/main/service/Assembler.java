package main.service;

import main.DTO.MemberDao;

//ÀÇÁ¸°´Ã¼¸¦ ¸ð¾Æ µÓ½Ã´Ù.°´Ã¼ Á¶¿À¸³±â
public class Assembler {
 private MemberDao memberDao;
 private MemberPrinter printer;
 private MemberRegisterService memberRegisterService;
 private MemberListPrinter memberListPrinter;
 private ChangePasswordService changePasswordService;
 private MemberInfoPrinter memberInfoprinter;
 public Assembler() {
	 this.memberDao = new MemberDao();
	 this.printer = new MemberPrinter();
	 this.memberRegisterService =
			 new MemberRegisterService(memberDao);
	 this.memberListPrinter =
			 new MemberListPrinter(memberDao, printer);
	 this.changePasswordService =
			 new ChangePasswordService();
	 this.memberInfoprinter = 
			 new MemberInfoPrinter();
 }
 public MemberInfoPrinter getMemberInfoPrinter() {
	 memberInfoprinter.setMemberDao(memberDao);
	 memberInfoprinter.setPrinter(printer);
	 return memberInfoprinter;
			 
 }
 public ChangePasswordService getChangePasswordService() {
	 changePasswordService.setMemberDao(memberDao);
	 return changePasswordService;
 }
 public MemberListPrinter getMemberListPrinter() {
	 return memberListPrinter;
	 
 }
 public MemberRegisterService getMemberRegisterService() {
	 return memberRegisterService;
 }
 public MemberDao getMemberDao() {
	 return memberDao;
 }
 public MemberPrinter getPrinter() {
	 return printer;
 }
}
