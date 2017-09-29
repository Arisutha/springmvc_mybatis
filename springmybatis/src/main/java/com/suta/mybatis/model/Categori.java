package com.suta.mybatis.model;

import java.io.Serializable;

public class Categori implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String namaCategori;
	private String status;
	private Integer parentId = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaCategori() {
		return namaCategori;
	}

	public void setNamaCategori(String namaCategori) {
		this.namaCategori = namaCategori;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}
