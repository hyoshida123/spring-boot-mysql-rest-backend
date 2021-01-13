package com.hyoshida.mysqldemo;

import org.springframework.data.repository.CrudRepository;

import com.hyoshida.mysqldemo.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}