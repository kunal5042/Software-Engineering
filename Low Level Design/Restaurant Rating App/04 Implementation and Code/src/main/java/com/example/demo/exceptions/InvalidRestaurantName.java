package com.example.demo.exceptions;

/**
 * Custom exception for cases where a restaurant name is invalid.
 */
public class InvalidRestaurantName extends Exception {
  public InvalidRestaurantName(String restaurantName) {
    super("Invalid restaurant name: " + restaurantName);
  }
}
