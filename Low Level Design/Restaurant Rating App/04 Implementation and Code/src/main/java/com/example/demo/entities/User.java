package com.example.demo.entities;

import java.util.List;

public class User {
  private Integer id;
  private List<Integer> reviews;
  private UserLevel level;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public List<Integer> getReviews() {
    return reviews;
  }

  public void setReviews(List<Integer> reviews) {
    this.reviews = reviews;
  }

  public UserLevel getLevel() {
    return level;
  }

  public void setLevel(UserLevel level) {
    this.level = level;
  }
}

