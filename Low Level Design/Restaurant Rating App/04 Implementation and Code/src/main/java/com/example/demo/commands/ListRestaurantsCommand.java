package com.example.demo.commands;

import com.example.demo.entities.Restaurant;
import com.example.demo.entities.Review;
import com.example.demo.services.IRestaurantService;
import com.example.demo.services.RestaurantService;

import java.util.ArrayList;
import java.util.List;

public class ListRestaurantsCommand implements ICommand {
    private final IRestaurantService restaurantService;

    public ListRestaurantsCommand(IRestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @Override
    public void invoke(List<String> tokens) {
        List<Restaurant> restaurants = restaurantService.getAllRestaurants();
        List<String> restaurantStrings = new ArrayList<>();
        for(Restaurant restaurant: restaurants){
            restaurantStrings.add(restaurant.toString());
        }
        String output = String.join(", ", restaurantStrings);
        System.out.println("[" + output + "]");
    }
}
