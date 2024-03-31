package com.example.demo.commands;

import java.util.List;

import com.example.demo.entities.Restaurant;
import com.example.demo.exceptions.InvalidRestaurantName;
import com.example.demo.services.IRestaurantService;
import com.example.demo.services.IUserService;

public class RegisterRestaurantCommand implements ICommand{
    private final IRestaurantService restaurantService;

    public RegisterRestaurantCommand(IRestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @Override
    public void invoke(List<String> tokens) throws InvalidRestaurantName {
        String name = tokens.get(1);
        Integer id = restaurantService.registerRestaurant(name);
        Restaurant restaurant = restaurantService.describeRestaurant(id);
        System.out.println(restaurant);
    }
}

