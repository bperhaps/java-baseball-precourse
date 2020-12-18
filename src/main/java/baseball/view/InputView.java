package baseball.view;

import java.util.Scanner;

public class InputView {
    final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String scan() {
        return scanner.nextLine();
    }
}
