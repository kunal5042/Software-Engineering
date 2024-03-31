package com.example.demo.services;

import com.example.demo.entities.Restaurant;
import com.example.demo.exceptions.InvalidRestaurantName;
import com.example.demo.repositories.IRestaurantRepository;

import java.util.List;

public class RestaurantService implements IRestaurantService {
  private final IRestaurantRepository restaurantRepository;

  public RestaurantService(IRestaurantRepository restaurantRepository) {
    this.restaurantRepository = restaurantRepository;
  }

  @Override
  public Integer registerRestaurant(String name) throws InvalidRestaurantName {
    if (name == null || name.isEmpty()) {
      throw new InvalidRestaurantName("Restaurant name cannot be null or empty.");
    }

    return restaurantRepository.registerRestaurant(name);
  }

  @Override
  public List<Restaurant> getAllRestaurants() {
    return restaurantRepository.getAllRestaurants();
  }

  @Override
  public Restaurant describeRestaurant(Integer restaurantId) {
    return restaurantRepository.describeRestaurant(restaurantId);
  }

  @Override
  public boolean isValidRestaurant(Integer restaurantId) {
    return restaurantRepository.isValidRestaurant(restaurantId);
  }
}
