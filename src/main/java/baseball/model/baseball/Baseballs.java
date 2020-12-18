package baseball.model.baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Baseballs {
    private static final int BASEBALL_NUMBER = 3;

    List<Baseball> baseballs;

    public Baseballs(List<Baseball> baseballs) {
        this.baseballs = baseballs;
    }

    public static Baseballs random() {
        Set<Baseball> randomBaseballs = new HashSet<>();

        while(randomBaseballs.size() != BASEBALL_NUMBER) {
            randomBaseballs.add(Baseball.random());
        }

        return new Baseballs(new ArrayList<>(randomBaseballs));
    }

    public static Baseballs valueOf(String numbers) {
        List<Baseball> baseballs = toBaseBalls(numbers);
        validateDuplicate(baseballs);

        return new Baseballs(baseballs);
    }

    private static List<Baseball> toBaseBalls(String numbers) {
        return numbers.chars().boxed().map(Baseball::of).collect(Collectors.toList());
    }

    private static void validateDuplicate(List<Baseball> baseballs) {
        if (baseballs.stream().distinct().count() != BASEBALL_NUMBER) {
            throw new IllegalArgumentException();
        }
    }
}
