package com.suta.mybatis.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Options.FlushCachePolicy;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.suta.mybatis.model.User;

public interface UserMapper {

	@Select("SELECT * FROM DEMO_MYBATIS.USER")
	public ArrayList<User> getAllUser() throws Exception;

	@Select("SELECT * FROM DEMO_MYBATIS.USER U WHERE U.ID = #{ID}")
	public User getSingleUser(@Param("ID") int id) throws Exception;

	@Insert("INSERT INTO DEMO_MYBATIS.USER(NAME, AGE, SEX, CREATE_TIME) VALUES (#{name}, #{age}, #{sex}, #{create_time})")
	@Options(useGeneratedKeys=true, keyProperty="ID", flushCache=FlushCachePolicy.TRUE, keyColumn="ID")
	public boolean insert(User user) throws Exception;
	
	@Update("UPDATE DEMO_MYBATIS.USER SET NAME=#{name}, AGE=#{age}, SEX=#{sex}, CREATE_TIME=#{create_time} WHERE ID=#{id}")
	public boolean update(User user) throws Exception;
	
	@Delete("DELETE FROM DEMO_MYBATIS.USER WHERE ID = #{ID}")
	public boolean delete(@Param("ID") int id) throws Exception;
}
