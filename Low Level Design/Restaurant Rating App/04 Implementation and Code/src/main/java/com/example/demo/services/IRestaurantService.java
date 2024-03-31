package com.example.demo.services;

import com.example.demo.entities.Restaurant;
import com.example.demo.exceptions.InvalidRestaurantName;
import com.example.demo.repositories.IRestaurantRepository;

import java.util.List;

/**
        * Interface for restaurant service.
        */
public interface IRestaurantService {
  /**
   * Register a restaurant.
   * @param name The name of the restaurant.
   * @return The ID of the registered restaurant.
   * @throws InvalidRestaurantName If the restaurant name is invalid.
   */
  Integer registerRestaurant(String name) throws InvalidRestaurantName;

  /**
   * Get IDs of all restaurants.
   * @return A list of restaurant IDs.
   */
  List<Restaurant> getAllRestaurants();

  /**
   * Describe a restaurant.
   * @param restaurantId The ID of the restaurant.
   * @return The Restaurant object describing the restaurant.
   */
  Restaurant describeRestaurant(Integer restaurantId);

  /**
   * Check if a restaurant with the given restaurantId is registered.
   *
   * @param userId The unique identifier of the restaurant to check.
   * @return True if the restaurant is registered, otherwise false.
   */
  boolean isValidRestaurant(Integer userId);

}


