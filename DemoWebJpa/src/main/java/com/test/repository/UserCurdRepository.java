/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.test.repository;

import com.test.beans.UserData;
import org.springframework.data.repository.CrudRepository;

public interface UserCurdRepository extends CrudRepository<UserData, Long> {
}