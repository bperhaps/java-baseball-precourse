package baseball;

import baseball.service.BaseballGameService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        BaseballGameService baseballGameService = new BaseballGameService(scanner);
        baseballGameService.run();
    }
}
