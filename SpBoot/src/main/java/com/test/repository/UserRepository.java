package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.test.beans.UserData;

public interface UserRepository extends Repository<UserData,Long>{
	@Query(value = "select userName,password,phone,email,city,state,address from UserData a where a.userName=:username and a.password=:password")
	List<UserData> findByNameMatch(@Param("username") String username,@Param("password") String password);

}
