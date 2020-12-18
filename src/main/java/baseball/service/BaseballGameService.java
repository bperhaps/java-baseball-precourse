package baseball.service;

import baseball.model.baseball.Baseballs;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Scanner;

public class BaseballGameService {
    public void run(Scanner scanner) {
        InputView inputView = new InputView(scanner);

        Baseballs computerBaseballs = Baseballs.random();
        OutputView.InputNumberMessage();
        Baseballs userBaseballs = Baseballs.valueOf(inputView.scan());
    }
}
