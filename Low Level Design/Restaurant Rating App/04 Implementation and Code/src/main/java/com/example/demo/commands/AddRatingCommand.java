package com.example.demo.commands;

import com.example.demo.services.IReviewService;

import java.util.List;

public class AddRatingCommand implements ICommand {
    private final IReviewService reviewService;

    public AddRatingCommand(IReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @Override
    public void invoke(List<String> tokens) {
        Integer rating = Integer.parseInt(tokens.get(1));
        Integer userId = Integer.parseInt(tokens.get(2));
        Integer restaurantId = Integer.parseInt(tokens.get(3));
        try {
            Integer reviewId = reviewService.addRating(rating, userId, restaurantId);
            System.out.println("Review [id=" + reviewId + "] added successfully for Restaurant [id=" + restaurantId + "] by User [id=" + userId + "]!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



