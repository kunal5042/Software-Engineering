package com.example.demo.entities;

import java.util.HashMap;
import java.util.Map;

public class Review {
  private Integer id;
  private Integer userId;
  private Integer restaurantId;
  private Integer rating;
  private final Map<String, String> dishToReview = new HashMap<>();
  private String description;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(Integer restaurantId) {
    this.restaurantId = restaurantId;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Map<String, String> getDishToReview() {
    return dishToReview;
  }

  public String addDishReview(String dishName, String description) {
    return this.dishToReview.put(dishName,description);
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  @Override
  public String toString(){
    return String.format("Review [id=%d]", this.getId());
  }
}
