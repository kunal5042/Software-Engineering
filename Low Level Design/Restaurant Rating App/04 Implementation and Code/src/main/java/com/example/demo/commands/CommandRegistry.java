package com.example.demo.commands;

import com.example.demo.entities.Order;
import com.example.demo.entities.UserLevel;
import com.example.demo.exceptions.InvalidRestaurantName;
import com.example.demo.services.IReviewService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommandRegistry {
    private static final Map<String, ICommand> commands = new HashMap<>();

    public void registerCommand(String commandKeyword, ICommand command) {
        commands.putIfAbsent(commandKeyword,command);
    }

    public void unRegisterCommand(String commandKeyword) {
        commands.remove(commandKeyword);
    }

    private ICommand get(String commandName){
        return commands.get(commandName);
    }

    private List<String> parse(String input){
        return Arrays.stream(input.split(" ")).collect(Collectors.toList());
    }


    public void invokeCommand(String input) throws InvalidRestaurantName {
        List<String> tokens = parse(input);
        ICommand command = get(tokens.get(0));
        if(command == null){
            // Handle Exception
            throw new RuntimeException("INVALID COMMAND 🛑: " + tokens.get(0));
        } 
        command.invoke(tokens);
        return;
    }
}



