package baseball.service;

import baseball.model.GameResult;
import baseball.model.baseball.Baseballs;
import baseball.model.service.GameService;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Scanner;

import static baseball.view.InputView.EXIT;

public class BaseballGameService {
    private final Scanner scanner;

    public BaseballGameService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        InputView inputView = new InputView(scanner);
        Baseballs computerBaseballs = Baseballs.random();
        playGame(inputView, computerBaseballs);
        OutputView.gameFinishedMessage();
        OutputView.restartGameMessage();

        int isRestart = inputView.restartOrFinishScan();

        if (isRestart == EXIT) {
            return;
        }

        run();
    }

    private void playGame(InputView inputView, Baseballs computerBaseballs) {
        GameResult gameResult;

        do {
            OutputView.inputNumberMessage();
            Baseballs userBaseballs = Baseballs.valueOf(inputView.scan());

            GameService gameService = new GameService();
            gameResult = gameService.match(userBaseballs, computerBaseballs);

            OutputView.print(gameResult.toString());
        } while(!gameResult.isFinish());
    }
}
