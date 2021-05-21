package com.kgc.webprj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgc.webprj.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
