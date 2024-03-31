package com.example.demo.services;

import java.util.List;

/**
 * Interface for managing user-related operations.
 */
public interface IUserService {

  /**
   * Sign up a new user with the given name.
   *
   * @param name The name of the user to sign up.
   * @return The unique identifier (userId) assigned to the user.
   */
  Integer signUp(String name);

  /**
   * Check if a user with the given userId is registered.
   *
   * @param userId The unique identifier of the user to check.
   * @return True if the user is registered, otherwise false.
   */
  boolean isRegisteredUser(Integer userId);
}

