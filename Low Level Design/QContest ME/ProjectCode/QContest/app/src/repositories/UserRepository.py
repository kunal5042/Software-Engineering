from typing import List, Optional

from src.entities import User

class UserRepository:
    def __init__(self) -> None:
        self._userMap = {}
        self._autoIncrement = 1

    def save(self,user: User) -> User:
        user._id = self._autoIncrement
        self._userMap[self._autoIncrement] = user
        self._autoIncrement += 1
        return user

    def findAll(self) -> List[User]:
        return list(self._userMap.values())

    def findById(self, id: int) -> Optional[User]:
        return self._userMap.get(id)

    def findByName(self,name: str) -> Optional[User]:
        # Find an user which matches with the required name
        user = next(filter(lambda u: u.get_name() == name,self._userMap.values()),None)
        if user is None:
            raise RuntimeError(f"User with username::{name} not found!")
        return user