package com.example.demo.services;
import com.example.demo.entities.Order;
import com.example.demo.entities.Review;
import com.example.demo.exceptions.InvalidRating;
import com.example.demo.exceptions.InvalidRestaurant;
import com.example.demo.exceptions.UserNotRegistered;
import com.example.demo.repositories.IReviewRepository;
import com.example.demo.repositories.IUserRepository;

import java.util.List;
public interface IReviewService {
  /**
   * Add a rating for a restaurant.
   * @param rating The rating to be added.
   * @param userId The ID of the user adding the rating.
   * @param restaurantId The ID of the restaurant being rated.
   * @return The ID of the review.
   * @throws UserNotRegistered If the user is not registered.
   * @throws InvalidRestaurant If the restaurant ID is invalid.
   * @throws InvalidRating If the rating is invalid.
   */
  Integer addRating(Integer rating, Integer userId, Integer restaurantId) throws UserNotRegistered, InvalidRestaurant, InvalidRating;

  /**
   * Add a review for a restaurant.
   * @param rating The rating given in the review.
   * @param userId The ID of the user adding the review.
   * @param restaurantId The ID of the restaurant being reviewed.
   * @param dishNames The names of the dishes being reviewed.
   * @param description The description of the review.
   * @return The ID of the review.
   * @throws UserNotRegistered If the user is not registered.
   * @throws InvalidRestaurant If the restaurant ID is invalid.
   * @throws InvalidRating If the rating is invalid.
   */
  Integer addReview(Integer rating, Integer userId, Integer restaurantId, List<String> dishNames, String description) throws UserNotRegistered, InvalidRestaurant, InvalidRating;

  /**
   * Get reviews for a restaurant.
   * @param restaurantId The ID of the restaurant.
   * @param order The order in which reviews should be retrieved.
   * @return A list of review IDs.
   */
  List<Review> getReviews(Integer restaurantId, Order order);

  /**
   * Get reviews for a restaurant within a rating range.
   * @param restaurantId The ID of the restaurant.
   * @param lowRating The lower bound of the rating range.
   * @param highRating The upper bound of the rating range.
   * @param order The order in which reviews should be retrieved.
   * @return A list of review IDs.
   */
  List<Review> getReviews(Integer restaurantId, Integer lowRating, Integer highRating, Order order);
}



