package com.example.demo.services;

import com.example.demo.entities.Order;
import com.example.demo.entities.Restaurant;
import com.example.demo.entities.Review;
import com.example.demo.exceptions.InvalidRating;
import com.example.demo.exceptions.InvalidRestaurant;
import com.example.demo.exceptions.UserNotRegistered;
import com.example.demo.repositories.IReviewRepository;
import com.example.demo.repositories.IUserRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ReviewService implements IReviewService {
  private IReviewRepository reviewRepository;
  private IUserService userService;
  private IRestaurantService restaurantService;

  public ReviewService(IReviewRepository reviewRepository, IUserService userService, IRestaurantService restaurantService) {
    this.reviewRepository = reviewRepository;
    this.userService = userService;
    this.restaurantService = restaurantService;
  }

  @Override
  public Integer addRating(Integer rating, Integer userId, Integer restaurantId) throws UserNotRegistered, InvalidRestaurant, InvalidRating {
    // Validate user registration
    if (!userService.isRegisteredUser(userId)) {
      throw new UserNotRegistered(userId );
    }

    // Validate restaurant
    if (!restaurantService.isValidRestaurant(restaurantId)) {
      throw new InvalidRestaurant(restaurantId);
    }

    // Validate rating
    if (rating < 1 || rating > 5) {
      throw new InvalidRating(rating);
    }

    Optional<Restaurant> nullableRestaurant = this.restaurantService.getAllRestaurants().stream().filter(restaurant -> Objects.equals(restaurant.getId(), restaurantId)).findFirst();
    if(nullableRestaurant.isPresent()){
      Restaurant restaurant = nullableRestaurant.get();
      restaurant.incrementRating(Double.valueOf(rating));
    }
    // Add rating to repository
    return reviewRepository.addRating(rating, userId, restaurantId);
  }

  @Override
  public Integer addReview(Integer rating, Integer userId, Integer restaurantId, List<String> dishNames, String description) throws UserNotRegistered, InvalidRestaurant, InvalidRating {
    // Similar validation logic as addRating method

    // Add review to repository
    return reviewRepository.addReview(rating, userId, restaurantId, dishNames, description);
  }

  @Override
  public List<Review> getReviews(Integer restaurantId, Order order) {
    // Get reviews from repository based on restaurant ID and order
    return reviewRepository.getReviews(restaurantId, order);
  }

  @Override
  public List<Review> getReviews(Integer restaurantId, Integer lowRating, Integer highRating, Order order) {
    // Get reviews from repository based on restaurant ID, rating range, and order
    return reviewRepository.getReviews(restaurantId, lowRating, highRating, order);
  }
}



