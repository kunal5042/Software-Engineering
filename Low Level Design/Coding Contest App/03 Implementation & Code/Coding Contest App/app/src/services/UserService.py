from typing import List
from src.constants import UserOrder
from src.entities import User
from src.repositories import UserRepository

class UserService:
    def __init__(self, userRepository: UserRepository) -> None:
        self._userRepository = userRepository
    
    def createUser(self, name: str) -> User:
        user = User(name)
        return self._userRepository.save(user)

    def getUsers(self, order: UserOrder) -> List[User]:
        users = self._userRepository.findAll()
        if order != UserOrder.SCORE_ASC:
            users.sort(reverse=True)
        else:
            users.sort()
        return users

        
