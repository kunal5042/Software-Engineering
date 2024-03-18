- [[#Assumptions|Assumptions]]
- [[#Features|Features]]
- [[#Bonus|Bonus]]
- [[#Commands|Commands]]
- [[#Notes|Notes]]
- [[#Sample Input|Sample Input]]
- [[#Sample Output|Sample Output]]

# Problem Statement

Everyone uses Zomato or Swiggy, but have you ever wondered how restaurant rating systems work? Now, when you give a review or rating to the restaurant, you will know how it works because we are going to design a rating platform. So let’s design a restaurant rating platform for the below features.

## Assumptions

1. Restaurant list is already given. Restaurant contains ID and name.

## Features

1. Users should be able to register to give ratings for restaurants.
2. Among the pre-populated list of restaurants, registered users can give ratings between 1 to 5. If the same user gives a new rating for the same restaurant, it should be overwritten.
3. Along with a rating, users can add optional dish name(s) and rating description. Basically, it is a review.
4. When fetching reviews for a restaurant based on filter and order by
    1. Filter: Reviews should be able to be filtered based on the range of rating (e.g., ratings between 2 (lower range) and 5 (higher range)).
    2. Order by ascending or descending rating.
    3. Default ordering is higher rating without any filter.
5. When describing a restaurant, along with the name, give the average rating it received so far. We will make use of the 5 Star Rating Approach to display the rating of the restaurants.
6. List restaurants based on descending order of (average) rating.

## Bonus

1. For each user, a level will be defined which determines their foodiness. A new user by default will have level 1. The level would be allotted based on the number of ratings given by a user.
    1. 4 ratings: level 2
    2. 8 ratings: level 3
    3. 16 ratings: level 4
2. When fetching reviews for a restaurant based on filter and order by
    1. Filter: Add the range of levels of reviewers whose ratings you want to fetch.
    2. Order by: Order reviews by levels of reviewers.

## Commands

1. **REGISTER_RESTAURANT** `<name>`

   Example: `REGISTER_RESTAURANT “Mama’s Kitchen”`

   Output: Restaurant [id=1]

2. **REGISTER_USER** `<name>`

   Example: `REGISTER_USER ANAND`

   Output: User [id=1]

3. **ADD_RATING** `<rating> <userId> <restaurantId>`

   Example: `ADD_RATING 3 1 2`

   Output: Review [id=4] added successfully for Restaurant [id=1] by User [id=4]!

4. **ADD_REVIEW** `<rating> <userId> <restaurantId> <list of dish_names> <description>`

   Example: `ADD_REVIEW 4 1 2 “pav bhaji dosa” “pav bhaji and dosa was tasty”`

   Output: Review [id=4] added successfully for Restaurant [id=1] by User [id=4]!

5. **GET_REVIEWS** `<restaurant_id> <order>`

   Example: `GET_REVIEWS 2 RATING_ASC`

   Output: [Review [id=7], Review [id=5], Review [id=6], Review [id=8]]

6. **GET_REVIEWS_FILTER_ORDER** `<restaurant_id> <low> <high> <order>`

   Example: `GET_REVIEWS_FILTER_ORDER 2 2 5 RATING_DESC`

   Output: [Review [id=7], Review [id=5], Review [id=6], Review [id=8]]

7. **DESCRIBE_RESTAURANT** `<restaurant_id>`

   Example: `DESCRIBE_RESTAURANT 2`

   Output: Restaurant [id=1, name=A2B, rating=2.6]

8. **LIST_RESTAURANTS**

   Example: `LIST_RESTAURANTS`

   Output: [Restaurant [id=1], Restaurant [id=2]]

# Expectations

- Code should be Demo-able and functionally complete.
- Code should fail gracefully with a proper error message for corner/invalid cases, use exceptions for handling these cases.
- Code should be modular, try thinking in terms of Object-Oriented Design.
- Input can be taken from the command line or in the main function.
- Do not use any database or NoSQL store, use in-memory data structure.
- Do not create any UI for the application
- Driver class can be designed as per your choice, but it should cover all the scenarios.
- Please prioritize code compilation, execution, and completion.
- Work on the expected output first and then only work on bonus features.

## Notes

1) Precision of average ratings must be till one digit only after the decimal point.

2) Average rating algorithm for reference:- [How to Calculate the Star Rating | Baeldung on Computer Science](https://www.google.com/url?q=https://www.baeldung.com/cs/star-rating-reviews&sa=D&source=editors&ust=1710080648559983&usg=AOvVaw0ChR3XwXigmMOmKDj1qzrj)

## Sample Input

REGISTER_USER ANAND

REGISTER_USER OBAMA

REGISTER_USER MAHINDRA

REGISTER_USER ADANI

REGISTER_USER AMBANI

REGISTER_RESTAURANT A2B

REGISTER_RESTAURANT A2Z

ADD_RATING 2 1 1

ADD_RATING 4 2 1

ADD_RATING 1 3 1

ADD_RATING 3 4 1

ADD_RATING 2 2 2

ADD_RATING 3 1 2

ADD_RATING 1 3 2

ADD_RATING 4 4 2

ADD_RATING 3 5 1

GET_REVIEWS 2 RATING_ASC

GET_REVIEWS_FILTER_ORDER 2 2 5 RATING_DESC

GET_REVIEWS_FILTER_ORDER 1 1 2 RATING_ASC

DESCRIBE_RESTAURANT 2

DESCRIBE_RESTAURANT 1

LIST_RESTAURANTS

## Sample Output

User [id=1]

User [id=2]

User [id=3]

User [id=4]

User [id=5]

Restaurant [id=1]

Restaurant [id=2]

Review [id=1] added successfully for Restaurant [id=1] by User [id=1]!

Review [id=2] added successfully for Restaurant [id=1] by User [id=2]!

Review [id=3] added successfully for Restaurant [id=1] by User [id=3]!

Review [id=4] added successfully for Restaurant [id=1] by User [id=4]!

Review [id=5] added successfully for Restaurant [id=2] by User [id=2]!

Review [id=6] added successfully for Restaurant [id=2] by User [id=1]!

Review [id=7] added successfully for Restaurant [id=2] by User [id=3]!

Review [id=8] added successfully for Restaurant [id=2] by User [id=4]!

Review [id=9] added successfully for Restaurant [id=1] by User [id=5]!

[Review [id=7], Review [id=5], Review [id=6], Review [id=8]]

[Review [id=8], Review [id=6], Review [id=5]]

[Review [id=3], Review [id=1]]

Restaurant [id=2, name=A2Z, rating=2.5]

Restaurant [id=1, name=A2B, rating=2.6]

[Restaurant [id=1], Restaurant [id=2]]
