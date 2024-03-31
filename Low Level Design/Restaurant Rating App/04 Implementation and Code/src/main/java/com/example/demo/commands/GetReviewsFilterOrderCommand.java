package com.example.demo.commands;

import com.example.demo.entities.Order;
import com.example.demo.entities.Restaurant;
import com.example.demo.entities.Review;
import com.example.demo.services.IRestaurantService;
import com.example.demo.services.IReviewService;

import java.util.ArrayList;
import java.util.List;

public class GetReviewsFilterOrderCommand implements ICommand {
    private final IReviewService reviewService;

    public GetReviewsFilterOrderCommand(IReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @Override
    public void invoke(List<String> tokens) {
        Integer restaurantId = Integer.parseInt(tokens.get(1));
        Integer lowRating = Integer.parseInt(tokens.get(2));
        Integer highRating = Integer.parseInt(tokens.get(3));
        Order order = Order.valueOf(tokens.get(4));
        List<Review> reviews = reviewService.getReviews(restaurantId, lowRating, highRating, order);
        List<String> reviewStrings = new ArrayList<>();
        for(Review review: reviews){
            reviewStrings.add(review.toString());
        }
        String output = String.join(", ", reviewStrings);
        System.out.println("[" + output + "]");
    }
}


