package com.bitcamp.domains;

public class SubjectBean {
	private int kor,math,eng;
	
	public void setKor(int kor) {
		this.kor = kor;
	}public int getKor() {
		return kor;
	}public void setMath(int math) {
		this.math = math;
	}public int getMath() {
		return math;
	}public void setEng(int eng) {
		this.eng = eng;
	}public int getEng() {
		return eng;
	}
	
	@Override
	public String toString() {
		return String.format("국어 : %d \n"
				+ "수학 : %d \n"
				+ "영어 :",kor,math,eng);
				}
	
}
