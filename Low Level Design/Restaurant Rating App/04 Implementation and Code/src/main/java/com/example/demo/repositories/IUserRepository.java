package com.example.demo.repositories;

public interface IUserRepository {
  Integer create(String name);
  boolean findById(Integer userId);
}

