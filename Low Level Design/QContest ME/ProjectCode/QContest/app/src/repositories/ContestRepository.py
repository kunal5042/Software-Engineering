from typing import List, Optional

from src.entities import Contest, Level

class ContestRepository:
    def __init__(self) -> None:
        self._contestMap = {}
        self._autoIncrement = 1

    def save(self,contest: Contest) -> Contest:
        c = Contest(contest.get_title(),contest.get_level(),contest.get_creator(),contest.get_questions(),self._autoIncrement)
        self._contestMap[self._autoIncrement] = c
        self._autoIncrement += 1
        return c

    def findAll(self) -> List[Contest]:
        return list(self._contestMap.values())

    def findById(self, id: int) -> Optional[Contest]:
        contest = None
        try:
            contest = self._contestMap.get(id)
        except:
            raise RuntimeError(f"Contest with id:: {id} not found!")
        return contest

    def findAllContestLevelWise(self,level: Level) -> List[Contest]:
        contests = []
        for contestId, contest in self._contestMap.items():
            if contest.get_level() == level:
                contests.append(contest)
        return contests
