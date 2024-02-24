package com.ensenada.inventarioapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensenada.inventarioapp.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
