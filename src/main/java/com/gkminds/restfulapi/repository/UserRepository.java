package com.gkminds.restfulapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gkminds.restfulapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
