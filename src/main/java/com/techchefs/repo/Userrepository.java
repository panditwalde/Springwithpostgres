package com.techchefs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techchefs.model.User;

public interface Userrepository extends JpaRepository<User, Object> {

}
