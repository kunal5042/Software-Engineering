package com.example.demo.commands;

import com.example.demo.entities.Restaurant;
import com.example.demo.services.IRestaurantService;

import java.util.ArrayList;
import java.util.List;

public class DescribeRestaurantCommand implements ICommand {
    private final IRestaurantService restaurantService;

    public DescribeRestaurantCommand(IRestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @Override
    public void invoke(List<String> tokens) {
        Integer restaurantId = Integer.parseInt(tokens.get(1));
        Restaurant restaurant = restaurantService.describeRestaurant(restaurantId);
        List<String> restaurantStrings = new ArrayList<>();
        restaurantStrings.add(String.format("Restaurant [id=%d", restaurant.getId()));
        restaurantStrings.add(String.format("name=%s", restaurant.getName()));
        restaurantStrings.add(String.format("rating=%.1f", restaurant.getAverageRating()));
        String output = String.join(", ", restaurantStrings);
        System.out.println(output + "]");
    }
}


