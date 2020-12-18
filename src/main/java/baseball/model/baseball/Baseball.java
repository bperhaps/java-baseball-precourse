package baseball.model.baseball;

import baseball.exceptions.BaseballNumberRangeException;
import utils.RandomUtils;

public class Baseball {
    static final int MINIMUM_BASEBALL_NUMBER = '1';
    static final int MAXIMUM_BASEBALL_NUMBER = '9';

    int number;

    private Baseball(int number) {
        this.number = number;
    }

    public static Baseball of(int number) {
        if(!isRightRange(number)) {
            throw new IllegalArgumentException();
        }
        return new Baseball(number);
    }

    public static Baseball random() {
        int randomNumber = createRandomBaseballNumber();
        return new Baseball(randomNumber);
    }

    private static boolean isRightRange(int number) {
        return MINIMUM_BASEBALL_NUMBER <= number && number <= MAXIMUM_BASEBALL_NUMBER;
    }

    private static int createRandomBaseballNumber() {
        return RandomUtils.nextInt(MINIMUM_BASEBALL_NUMBER, MAXIMUM_BASEBALL_NUMBER);
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Baseball) {
            return ((Baseball) o).number == this.number;
        }

        return false;
    }
}
