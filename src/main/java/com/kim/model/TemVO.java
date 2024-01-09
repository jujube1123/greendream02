package com.kim.model;

public class TemVO {
	private String hdb;
	private String tdb;
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
		return "TemVO [hdb=" + hdb + ", tdb=" + tdb + ", dtim=" + dtim + "]";
	}
	
}	
