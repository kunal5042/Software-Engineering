package com.example.demo.exceptions;

/**
 * Custom exception for cases where a user is not registered.
 */
public class UserNotRegistered extends Exception {
  public UserNotRegistered(Integer userId) {
    super("User with ID " + userId + " is not registered.");
  }
}
