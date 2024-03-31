package com.example.demo.commands;

import com.example.demo.exceptions.InvalidRestaurantName;

import java.util.List;

public interface ICommand{
    void invoke(List<String> tokens) throws InvalidRestaurantName;
}
