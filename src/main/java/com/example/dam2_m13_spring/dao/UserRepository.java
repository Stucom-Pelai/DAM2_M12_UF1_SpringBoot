package com.example.dam2_m13_spring.dao;

import org.springframework.data.repository.CrudRepository;

import entity.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


public interface UserRepository extends CrudRepository<User, Integer> {

}
