## Problem Statement

- Q Contest is an online coding platform that allows a user to sign up, create contests and participate in contests hosted by other registered users..
    
- Each contest must have a level of difficulty (LOW, MEDIUM, HIGH) and will contain a set of unique questions ( Same question cannot be a part of more than one contest ).
    
- Each question will have different levels of difficulty (LOW, MEDIUM, HIGH) and score.
    
- Based on the contest level, the question set is going to be decided. Contest level with LOW difficulty will have questions with LOW difficulty level.
    
- Final score will be decided based on the difficulty LEVEL chosen for a contest and the number of questions.
    
- Users solve problems and get points based on the difficulty of the problems and after the contest, scores of the users are updated.

#### Class Relationship Diagram

Let’s visualize the relationship between the classes as given below

![image](https://storage.googleapis.com/crio-content-container-assets/ME_QCONTEST_MODULE_ME_QCONTEST_MODULE_ENTITIES_1662045748_image_7.png)
- Contest <-> Question
    
    - A Contest can have many questions.
        
    - Each question can only be a part of one contest as per the requirements.
        
- Contest <-> User
    
    - A Contest is created by one user.
        
    - A User can create many contests.
        
- Contestant <-> ( Contest, User )
    
    - A User can participate in multiple contests.
        
    - A Contest can have multiple participating users.
        
    - A Many to Many relationship exists between Contest and User which is defined by Contestant.
        
- Contestant <-> Question
    
    - A Contestant can solve many questions.
        
    - A question can be solved by many contestants.
        
    - A Many to Many relationship exists between Contestant and Question. Ideally, we could have defined this relationship by introducing a new class ( for eg: ContestantQuestions). But to keep things simple as per the limited requirements, we make a trade-off in design to define an aggregation relationship between Contestant and Question where Contestant will hold all the questions solved by the user.
        
        - If the scope of the problem was big enough, then it makes complete sense to define a many to many relationship using a new class between Contestant and Question.

#### Class Diagram

Below visual gives you an in depth overview of the classes containing attributes and behaviours respectively.

![image](https://storage.googleapis.com/crio-content-container-assets/ME_QCONTEST_MODULE_ME_QCONTEST_MODULE_ENTITIES_1662045749_image_8.png)
