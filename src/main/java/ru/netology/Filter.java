package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = list.stream()
                .filter(p -> p <= treshold)
                .collect(Collectors.toList());
        logger.log("Выводим результат на экран");
        return result;
    }
}
