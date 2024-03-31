package com.example.demo.exceptions;

/**
 * Custom exception for cases where a restaurant ID is invalid.
 */
public class InvalidRestaurant extends Exception {
  public InvalidRestaurant(Integer restaurantId) {
    super("Invalid restaurant ID: " + restaurantId);
  }
}
