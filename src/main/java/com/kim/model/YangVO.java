package com.kim.model;

public class YangVO {
	
	// 온도
	private String hdb;
	
	// 습도
	private String tdb;
	
	// 로그시간
	private String dtim;

	public String getHdb() {
		return hdb;
	}
	public void setHdb(String hdb) {
		this.hdb = hdb;
	}
	public String getTdb() {
		return tdb;
	}
	public void setTdb(String tdb) {
		this.tdb = tdb;
	}
	public String getDtim() {
		return dtim;
	}
	public void setDtim(String dtim) {
		this.dtim = dtim;
	}
	@Override
	public String toString() {
		return "YangVO [hdb=" + hdb + ", tdb=" + tdb + ", dtim=" + dtim + "]";
	}
	
}
