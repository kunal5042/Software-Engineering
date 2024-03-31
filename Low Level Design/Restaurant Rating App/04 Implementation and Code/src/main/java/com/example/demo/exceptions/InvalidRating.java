package com.example.demo.exceptions;

/**
 * Custom exception for cases where a rating is invalid.
 */
public class InvalidRating extends Exception {
  public InvalidRating(Integer rating) {
    super("Invalid rating: " + rating + ". Rating must be between 1 and 5.");
  }
}
