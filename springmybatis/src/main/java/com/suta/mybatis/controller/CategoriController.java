package com.suta.mybatis.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suta.mybatis.model.Categori;
import com.suta.mybatis.service.CategoriService;

@RestController
@RequestMapping(value = "/categori")
public class CategoriController {

	private static final Logger log = LoggerFactory.getLogger(CategoriController.class);
	
	@Autowired
	private CategoriService categoriService;
	
	@RequestMapping(value = "/listCategori", method = RequestMethod.GET)
	public ResponseEntity<List<Categori>> listCategori(){
		try {
			List<Categori> list = this.categoriService.getAllCategori();
			return new ResponseEntity<List<Categori>>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("error get list categori : "+ e.getMessage());
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "/getCategoriById", method = RequestMethod.GET)
	public ResponseEntity<Categori> getCategoriById(){
		try {
			Categori cat = this.categoriService.getSingleCategori(1);
			return new ResponseEntity<Categori>(cat, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("error get list categori : "+ e.getMessage());
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "/deleteCategoriById", method = RequestMethod.POST)
	public ResponseEntity<Boolean> deleteCategoriById(@RequestBody Categori categori){
		try {
			boolean result = this.categoriService.delete(categori.getId());
			return new ResponseEntity<Boolean>(result, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("error get list categori : "+ e.getMessage());
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "/saveCategori", method = RequestMethod.POST)
	public ResponseEntity<Boolean> saveCategori(@RequestBody Categori categori){
		try {
			boolean result = this.categoriService.insert(categori);
			return new ResponseEntity<Boolean>(result, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("error get list categori : "+ e.getMessage());
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "/updateCategori", method = RequestMethod.POST)
	public ResponseEntity<Boolean> updateCategori(@RequestBody Categori categori){
		try {
			boolean result = this.categoriService.update(categori);
			return new ResponseEntity<Boolean>(result, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("error get list categori : "+ e.getMessage());
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
}
