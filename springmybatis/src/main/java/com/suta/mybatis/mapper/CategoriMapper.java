package com.suta.mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.suta.mybatis.model.Categori;

public interface CategoriMapper {
	
	public List<Categori> getAllCategori() throws Exception;

	public Categori getSingleCategori(int id) throws Exception;

	public boolean insertCategori(Categori categori) throws Exception;

	public boolean updateCategori(Categori categori) throws Exception;

	public boolean deleteCategori(int id) throws Exception;
	
	public void getCategoriByHierarchy(Map<String,Object> params) throws Exception;
}
