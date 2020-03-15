package com.ateam.solohomes.user.main;

import java.util.ArrayList;

public class AjaxInfoList {

	int count;  // 데이터 갯수
	String status; // 처리결과
	ArrayList<ProductInfoDTO> list; // 데이터
	
	public AjaxInfoList() {
		super();
	}
	public AjaxInfoList(int count, String status, ArrayList<ProductInfoDTO> list) {
		super();
		this.count = count;
		this.status = status;
		this.list = list;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<ProductInfoDTO> getList() {
		return list;
	}
	public void setList(ArrayList<ProductInfoDTO> list) {
		this.list = list;
	}
}
