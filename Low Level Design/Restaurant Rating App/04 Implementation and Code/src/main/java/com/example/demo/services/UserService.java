package com.example.demo.services;

import com.example.demo.repositories.IUserRepository;

public class UserService implements IUserService {
  private IUserRepository userRepository;

  public UserService(IUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Integer signUp(String name) {
    return userRepository.create(name);
  }

  @Override
  public boolean isRegisteredUser(Integer userId) {
    return userRepository.findById(userId);
  }
}
