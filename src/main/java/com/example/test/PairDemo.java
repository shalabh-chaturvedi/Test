package com.example.test;

import org.springframework.data.util.Pair;

import java.util.Arrays;

public class PairDemo {
    public static void main(String[] args) {
        int[] input = {29,-1,0,12,84,32};
        Pair<Integer, Integer> output = calculateMinMax(input);
        System.out.println("Min value: " + output.getFirst());
        System.out.println("Max value: " + output.getSecond());
    }

    private static Pair<Integer, Integer> calculateMinMax(int[] input) {
        Arrays.sort(input);
        int min = input[0];
        int max = input[input.length-1];
        return Pair.of(min,max);
    }
}
