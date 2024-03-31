1. interface IUserService 
	- signUp(String name) -> userId
	- isRegisteredUser(Integer userId) -> boolean

2. interface IReviewService
	- addRating(Integer rating, Long userId, Long restaurantId) throws exception UserNotRegistered
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  ~```+++++++++++++++++
  
```validRestaurant, InvalidRating -> reviewId
	- addReview(Integer rating, Integer userId, Integer restaurantId, List\<String> dishNames, String description) -> reviewId
	- getReviews(Integer restaurantId, Enum order) -> List\<Integer> reviewIds
	- getReviews(Integer restaurantId, Integer lowRating, Integer highRating, Enum order) -> List\<Integer> reviewIds

3. interface IRestaurantService
	- registerRestaurant(String name) -> restaurantId
	- getAllRestaurants() -> List\<Integer> restaurantIds
	- describeRestaurant(Integer restaurantId) -> Restaurant Object





kfmlkfga'lfdkigeairtjpitjaerioja'gjmad'fgmal