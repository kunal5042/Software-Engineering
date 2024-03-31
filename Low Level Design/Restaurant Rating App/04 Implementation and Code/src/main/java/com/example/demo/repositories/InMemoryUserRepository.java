package com.example.demo.repositories;

import com.example.demo.entities.Restaurant;
import com.example.demo.entities.Review;
import com.example.demo.entities.User;

import java.util.*;

public class InMemoryUserRepository implements IUserRepository {
  private Map<Integer, User> users = new HashMap<>();
  private int nextUserId = 1;

  @Override
  public Integer create(String name) {
    Integer userId = nextUserId++;
    User user = new User();
    user.setId(userId);
    user.setReviews(new ArrayList<>()); // Initialize empty list of reviews
    users.put(userId, user);
    return userId;
  }

  @Override
  public boolean findById(Integer userId) {
    return users.containsKey(userId);
  }
}


