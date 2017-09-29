package com.suta.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suta.mybatis.mapper.CategoriMapper;
import com.suta.mybatis.model.Categori;
import com.suta.mybatis.service.CategoriService;

@Service
@Transactional
public class CategoriServiceImpl implements CategoriService {
	
	@Autowired
	private CategoriMapper categoriMapper;

	@Override
	public List<Categori> getAllCategori() throws Exception {
		return this.categoriMapper.getAllCategori();
	}

	@Override
	public Categori getSingleCategori(int id) throws Exception {
		return this.categoriMapper.getSingleCategori(id);
	}

	@Override
	public boolean insert(Categori categori) throws Exception {
		return this.categoriMapper.insertCategori(categori);
	}

	@Override
	public boolean update(Categori categori) throws Exception {
		return this.categoriMapper.updateCategori(categori);
	}

	@Override
	public boolean delete(int id) throws Exception {
		return this.categoriMapper.deleteCategori(id);
	}

}
