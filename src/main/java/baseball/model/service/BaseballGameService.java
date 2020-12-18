package baseball.model.service;

import baseball.model.GameResult;
import baseball.model.baseball.Baseballs;

public class BaseballGameService {
    public GameResult match(Baseballs b1, Baseballs b2) {
        int strike = b1.calculateStrike(b2);
        int ball = b1.calculateBall(b2);

        return new GameResult(strike, ball);
    }
}
