package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> Result = new ArrayList<>();

        int randomNumber = random.nextInt(3);
        while (true) {
            number = number - randomNumber;
            if (number < 0)
                break;
            Result.add(number);

        }
        return Result;
    }
}
