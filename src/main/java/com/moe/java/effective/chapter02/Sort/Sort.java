package com.moe.java.effective.chapter02.Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(20);
        numbers.add(44);
        numbers.add(3);

        Comparator<Integer> desc = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        numbers.sort(desc.reversed());
        System.out.println(numbers);

    }
}
