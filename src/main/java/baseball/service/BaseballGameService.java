package baseball.service;

import baseball.model.GameResult;
import baseball.model.baseball.Baseballs;
import baseball.model.service.GameService;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Scanner;

public class BaseballGameService {
    public void run(Scanner scanner) {
        InputView inputView = new InputView(scanner);

        Baseballs computerBaseballs = Baseballs.random();
        playGame(inputView, computerBaseballs);
    }

    public void playGame(InputView inputView, Baseballs computerBaseballs) {
        while(true) {
            OutputView.inputNumberMessage();
            Baseballs userBaseballs = Baseballs.valueOf(inputView.scan());

            GameService gameService = new GameService();
            GameResult gameResult = gameService.match(userBaseballs, computerBaseballs);

            OutputView.print(gameResult.toString());
            if (gameResult.isFinish()) {
                OutputView.gameFinishedMessage();
                break;
            }
        }
    }

    public static void main(String[] args ){
        BaseballGameService baseballGameService = new BaseballGameService();
        baseballGameService.run(new Scanner(System.in));
    }
}
