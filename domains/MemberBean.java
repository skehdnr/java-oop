package com.bitcamp.domains;

public class MemberBean {
	private String name,id,pass,ssn,bt;
	private double height,weight;
	
	public void setName(String name) {
		this.name = name;
	}public String getName() {
		return this.name;
	}public void setId(String id) {
		this.id = id;
	}public String getID() {
		return this.id;
	}public void setPass(String pass) {
		this.pass = pass;
	}public String getPass() {
		return this.pass;
	}public void setSsn(String ssn) {
		this.ssn = ssn;
	}public String getSsn() {
		return this.ssn;
	}public void setBt(String bt) {
		this.bt = bt;
	}public String getBt() {
		return this.bt;
	}public void setHeight(Double height) {
		this.height = height;
	}public Double getHeight() {
		return this.height;
	}public void setWeight(Double weight) {
		this.weight = weight;
	}public Double getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		//이름, 아이디, 비밀번호, 주민번호, 혈액형, 키,몸무게
		return String.format("[ 회원정보 ]\n"
				+ "이름 : %s\n"
				+ "아이디 : %s\n"
				+ "비밀번호 : %s\n"
				+ "주민번호 : %s\n"
				+ "혈액형 : %s형\n"
				+ "키 : %scm\n"
				+ "몸무게 : %skg ", name,id,pass,ssn,bt,height,weight);
		
		
	}
	
}
