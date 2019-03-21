package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        //if ( <= 0)
         //   return null;
        //int Divided_Number = this.random;
        /*
        while (true)
        {
            Divided_Number -= number;
            if (Divided_Number < 0)
                break;
            Result.add(Divided_Number);
        }

        */
        System.out.println(random.nextInt(3));



        return Result;
    }
}
