package com.example.demo.repositories;

import com.example.demo.entities.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRestaurantRepository implements IRestaurantRepository {
  private Map<Integer, Restaurant> restaurants = new HashMap<>();
  private int nextRestaurantId = 1;

  @Override
  public Integer registerRestaurant(String name) {
    Integer restaurantId = nextRestaurantId++;
    Restaurant restaurant = new Restaurant();
    restaurant.setId(restaurantId);
    restaurant.setName(name);
    restaurants.put(restaurantId, restaurant);
    return restaurantId;
  }

  @Override
  public List<Restaurant> getAllRestaurants() {
    return new ArrayList<>(restaurants.values());
  }

  @Override
  public Restaurant describeRestaurant(Integer restaurantId) {
    return restaurants.get(restaurantId);
  }

  @Override
  public boolean isValidRestaurant(Integer restaurantId) {
    return restaurants.containsKey(restaurantId);
  }
}
