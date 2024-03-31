1. User
1. Restaurant
2. Reviews

# Attributes and Methods
1. User
	- Attributes
		- Long id
		- List\<Long\> reviews
		- Enum level
	- Methods
		- getters
		- setters

2. Restaurant
	- Attributes
		- Long id
		- String name
		- Long averageRating
	- Methods
		- getters
		- setters

3. Review
	- Attributes
		- Long id
		- Long userId
		- Long restaurantId
		- Integer rating
		- Optional\<String\> dishName
		- String description
	- Methods
		- getters
		- setters

# Relationships and Cardinality
1. User-Review Relationship:
    - Cardinality: One-to-Many (1:M)
    - Explanation: One user can write multiple reviews, but each review is written by only one user.
      
2. Restaurant-Review Relationship:
    - Cardinality: One-to-Many (1:M)
    - Explanation: One restaurant can have multiple reviews, but each review is for only one restaurant.
      
3. User-Restaurant Relationship (based on the assumption that a user can review multiple restaurants):
    - Cardinality: Many-to-Many (M:N)
    - Explanation: A user can review multiple restaurants, and a restaurant can be reviewed by multiple users. This relationship is typically implemented using an intermediary entity (like a join table in a relational database) to manage the M:N relationship.