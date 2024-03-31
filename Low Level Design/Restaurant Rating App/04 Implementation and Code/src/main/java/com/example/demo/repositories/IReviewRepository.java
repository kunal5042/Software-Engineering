package com.example.demo.repositories;

import com.example.demo.entities.Order;
import com.example.demo.entities.Review;

import java.util.List;

public interface IReviewRepository {
  Integer addRating(Integer rating, Integer userId, Integer restaurantId);
  Integer addReview(Integer rating, Integer userId, Integer restaurantId, List<String> dishNames, String description);
  List<Review> getReviews(Integer restaurantId, Order order);
  List<Review> getReviews(Integer restaurantId, Integer lowRating, Integer highRating, Order order);
}
