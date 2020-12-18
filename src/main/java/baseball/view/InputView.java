package baseball.view;

import java.util.Scanner;

public class InputView {
    public static final int EXIT = 2;

    final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public int restartOrFinishScan() {
        String input = scanner.nextLine();

        validateRestartOrFinish(input);
        return Integer.parseInt(input);
    }

    private void validateRestartOrFinish(String input) {
        if (!isRightLength(input)) {
            throw new IllegalArgumentException();
        }

        if (!(input.equals("1") || input.equals("2"))) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isRightLength(String input) {
        return input.length() == 1;
    }

    public String scan() {
        return scanner.nextLine();
    }
}
