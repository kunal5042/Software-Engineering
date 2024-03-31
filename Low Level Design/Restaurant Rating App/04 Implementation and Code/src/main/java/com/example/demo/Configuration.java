package com.example.demo;

import com.example.demo.commands.AddRatingCommand;
import com.example.demo.commands.AddReviewCommand;
import com.example.demo.commands.CommandKeyword;
import com.example.demo.commands.CommandRegistry;
import com.example.demo.commands.DescribeRestaurantCommand;
import com.example.demo.commands.GetReviewsCommand;
import com.example.demo.commands.GetReviewsFilterOrderCommand;
import com.example.demo.commands.ICommand;
import com.example.demo.commands.ListRestaurantsCommand;
import com.example.demo.commands.RegisterRestaurantCommand;
import com.example.demo.commands.RegisterUserCommand;
import com.example.demo.repositories.IRestaurantRepository;
import com.example.demo.repositories.IReviewRepository;
import com.example.demo.repositories.IUserRepository;
import com.example.demo.repositories.InMemoryRestaurantRepository;
import com.example.demo.repositories.InMemoryReviewRepository;
import com.example.demo.repositories.InMemoryUserRepository;
import com.example.demo.services.IRestaurantService;
import com.example.demo.services.IReviewService;
import com.example.demo.services.IUserService;
import com.example.demo.services.RestaurantService;
import com.example.demo.services.ReviewService;
import com.example.demo.services.UserService;

public class Configuration {
            // Singleton Pattern
            //create an object of Single Configuration Object
            private static final Configuration instance = new Configuration();

            //make the constructor private so that this class cannot be
            //instantiated
            private Configuration(){}

            //Get the only object available
            public static Configuration getInstance(){
                return instance;
            }

    		// Initialize repositories
            IUserRepository userRepository = new InMemoryUserRepository();
  IReviewRepository reviewRepository = new InMemoryReviewRepository();
  IRestaurantRepository restaurantRepository = new InMemoryRestaurantRepository();

  // Initialize services
  IUserService userService = new UserService(userRepository);

  IRestaurantService restaurantService = new RestaurantService(restaurantRepository);

  IReviewService reviewService = new ReviewService(reviewRepository, userService, restaurantService);

            // Initialize commandRegistery
            private final CommandRegistry commandRegistry = new CommandRegistry();

            // Register commands 
            private void registerCommands() {
              for (CommandKeyword commandKeyword : CommandKeyword.values()) {
                ICommand command = null;
                switch (commandKeyword) {
                  case REGISTER_RESTAURANT:
                    command = new RegisterRestaurantCommand(restaurantService);
                    break;
                  case REGISTER_USER:
                    command = new RegisterUserCommand(userService);
                    break;
                  case ADD_RATING:
                    command = new AddRatingCommand(reviewService);
                    break;
                  case ADD_REVIEW:
                    command = new AddReviewCommand(reviewService);
                    break;
                  case GET_REVIEWS:
                    command = new GetReviewsCommand(reviewService);
                    break;
                  case GET_REVIEWS_FILTER_ORDER:
                    command = new GetReviewsFilterOrderCommand(reviewService);
                    break;
                  case DESCRIBE_RESTAURANT:
                    command = new DescribeRestaurantCommand(restaurantService);
                    break;
                  case LIST_RESTAURANT:
                    command = new ListRestaurantsCommand(restaurantService);
                    break;
                  default:
                    // Handle any other commands
                    break;
                }
                this.commandRegistry.registerCommand(commandKeyword.getName(), command);
              }
            }
            
            public CommandRegistry getCommandRegistry(){
                registerCommands();
                return commandRegistry;
            }
}
