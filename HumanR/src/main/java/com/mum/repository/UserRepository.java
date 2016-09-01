package com.mum.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mum.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	@Query("select u from User u where u.userName=:userName")
	public User findByUserName(@Param("userName")String userName);

}
