package com.example.demo.repositories;

import com.example.demo.entities.Order;
import com.example.demo.entities.Review;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryReviewRepository implements IReviewRepository {
  private Map<Integer, Review> reviews = new HashMap<>();
  private Integer nextReviewId = 1;

  @Override
  public Integer addRating(Integer rating, Integer userId, Integer restaurantId) {
    Integer reviewId = nextReviewId++;
    Review review = new Review();
    review.setId(reviewId);
    review.setRating(rating);
    review.setUserId(userId);
    review.setRestaurantId(restaurantId);
    reviews.put(reviewId, review);
    return reviewId;
  }

  public Review getReviewById(Integer reviewId){
    if(reviews.containsKey(reviewId)) {
      return reviews.get(reviewId);
    }
    throw new RuntimeException("Invalid reviewId:: " + reviewId);
  }

  @Override
  public Integer addReview(Integer rating, Integer userId, Integer restaurantId, List<String> dishNames, String description) {
    Integer reviewId = this.addRating(rating, userId, restaurantId);
    Review review = this.getReviewById(reviewId);
    review.setDescription(description);
    for(String dishName: dishNames){
      review.addDishReview(dishName, description);
    }
    this.reviews.put(reviewId, review);
    return reviewId;
  }

  @Override
  public List<Review> getReviews(Integer restaurantId, Order order) {
    // Filter reviews by restaurantId
    List<Review> restaurantReviews = reviews.values().stream()
            .filter(review -> review.getRestaurantId().equals(restaurantId))
            .collect(Collectors.toList());

    // Sort reviews based on order
    Comparator<Review> ratingComparator = Comparator.comparingInt(Review::getRating);
    if (order == Order.RATING_ASC) {
      restaurantReviews.sort(ratingComparator);
    } else {
      restaurantReviews.sort(ratingComparator.reversed());
    }

    return restaurantReviews;
  }

  @Override
  public List<Review> getReviews(Integer restaurantId, Integer lowRating, Integer highRating, Order order) {
    // Filter reviews by restaurantId and rating range
    List<Review> restaurantReviews = reviews.values().stream()
            .filter(review -> review.getRestaurantId().equals(restaurantId) &&
                    review.getRating() >= lowRating &&
                    review.getRating() <= highRating)
            .collect(Collectors.toList());

    // Sort reviews based on order
    Comparator<Review> ratingComparator = Comparator.comparingInt(Review::getRating);
    if (order == Order.RATING_ASC) {
      restaurantReviews.sort(ratingComparator);
    } else {
      restaurantReviews.sort(ratingComparator.reversed());
    }

    return restaurantReviews;
  }
}
