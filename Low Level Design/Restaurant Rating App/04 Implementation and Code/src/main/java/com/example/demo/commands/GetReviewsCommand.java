package com.example.demo.commands;

import com.example.demo.entities.Order;
import com.example.demo.entities.Review;
import com.example.demo.entities.UserLevel;
import com.example.demo.services.IReviewService;
import com.example.demo.services.ReviewService;

import java.util.ArrayList;
import java.util.List;

public class GetReviewsCommand implements ICommand {
  private final IReviewService reviewService;

  public GetReviewsCommand(IReviewService reviewService) {
    this.reviewService = reviewService;
  }

  @Override
  public void invoke(List<String> tokens) {
    Integer restaurantId = Integer.parseInt(tokens.get(1));
    Order order = Order.valueOf(tokens.get(2));
    List<Review> reviews = reviewService.getReviews(restaurantId, order);
    List<String> reviewStrings = new ArrayList<>();
    for(Review review: reviews){
      reviewStrings.add(review.toString());
    }
    String output = String.join(", ", reviewStrings);
    System.out.println("[" + output + "]");
  }
}