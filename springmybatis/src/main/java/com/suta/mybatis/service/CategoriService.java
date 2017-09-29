package com.suta.mybatis.service;

import java.util.List;

import com.suta.mybatis.model.Categori;

public interface CategoriService {

	public List<Categori> getAllCategori() throws Exception;

	public Categori getSingleCategori(int id) throws Exception;

	public boolean insert(Categori categori) throws Exception;

	public boolean update(Categori categori) throws Exception;

	public boolean delete(int id) throws Exception;
	
}
