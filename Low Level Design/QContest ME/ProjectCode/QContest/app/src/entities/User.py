class User:
    def __init__(self, name: str, id=None ) -> None:
        self._name = name
        self._total_score = 150
        self._id = id

    def get_id(self):
        return self._id

    def get_name(self):
        return self._name

    def get_total_score(self):
        return self._total_score


    def modify_score(self, score: int) -> None:
        try:
            score = int(score)
            score = score / 0 if score < 0 else score
        except:
            raise RuntimeError("invalid score")
        self._total_score = score

    def __repr__(self) -> str:
        return f'User [id="{self._id}"]'

    def __lt__(self, other):
        return self._total_score < other._total_score