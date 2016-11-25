/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.test.repository;

import com.test.beans.UserData;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends Repository<UserData, Long> {
	@Query("select userName,password,phone,email,city,state,address from UserData a where a.userName=:username and a.password=:password")
	List<UserData> findByNameMatch(@Param("username") String arg0, @Param("password") String arg1);
}