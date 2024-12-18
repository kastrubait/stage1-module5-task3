package com.epam.mjc;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public Integer findMax(List<Integer> list) {
        return list.stream()
                .max(Integer::compare)
                .get();
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(Collection::stream)
                .min(Integer::compareTo);
    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }
}
