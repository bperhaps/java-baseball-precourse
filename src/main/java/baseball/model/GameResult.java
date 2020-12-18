package baseball.model;

import baseball.model.baseball.Baseballs;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
    private static final String BALL = "%d볼";
    private static final String STRIKE = "%d스트라이크";
    private static final String NOTHING = "낫싱";
    private static final String DELIMITER = " ";

    private List<String> resultMessage;
    private int strike;
    private int ball;

    public GameResult(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
        resultMessage = new ArrayList<>();
    }

    private void strike() {
        if (strike == 0) {
            return;
        }

        resultMessage.add(String.format(STRIKE, strike));
    }

    private void ball() {
        if (ball == 0) {
            return;
        }

        resultMessage.add(String.format(BALL, ball));
    }

    public boolean isFinish() {
        return strike == Baseballs.BASEBALL_NUMBER;
    }

    @Override
    public String toString() {
        ball();
        strike();
        if(resultMessage.isEmpty()) {
            return NOTHING;
        }

        return String.join(DELIMITER, resultMessage);
    }
}
