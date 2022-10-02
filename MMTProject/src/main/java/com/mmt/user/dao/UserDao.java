package com.mmt.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmt.user.model.User;

public interface UserDao extends JpaRepository<User, String> {

}
