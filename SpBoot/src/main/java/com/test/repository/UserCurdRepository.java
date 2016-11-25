package com.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.beans.UserData;

public interface UserCurdRepository extends CrudRepository<UserData, Long>{

}
