package com.example.demo.commands;

import com.example.demo.services.IReviewService;
import com.example.demo.services.IUserService;

import java.util.List;

public class RegisterUserCommand implements ICommand {
    private final IUserService userService;

    public RegisterUserCommand(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public void invoke(List<String> tokens) {
        String name = tokens.get(1);
        Integer userId = userService.signUp(name);
        System.out.println("User [id=" + userId + "]");
    }
}
