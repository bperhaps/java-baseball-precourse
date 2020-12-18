package baseball.view;

public class OutputView {
    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String GAME_FINISHED_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임종료";

    public static void inputNumberMessage() {
        System.out.print(INPUT_NUMBER_MESSAGE);
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static void gameFinishedMessage() {
        System.out.println(GAME_FINISHED_MESSAGE);
    }
}
