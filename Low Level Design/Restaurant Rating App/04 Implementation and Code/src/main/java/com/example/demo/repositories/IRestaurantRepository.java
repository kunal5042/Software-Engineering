package com.example.demo.repositories;

import com.example.demo.entities.Restaurant;

import java.util.List;

public interface IRestaurantRepository {
  Integer registerRestaurant(String name);
  List<Restaurant> getAllRestaurants();
  Restaurant describeRestaurant(Integer restaurantId);
  boolean isValidRestaurant(Integer restaurantId);
}
