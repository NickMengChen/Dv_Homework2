package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> Result = new ArrayList<>();
        for (int i = 0; i < this.array.length; i++)
        {
            for (int j = 0; j < this.array[i].length; j++)
            {
                Result.add(this.array[i][j]);
            }

        }
        return Result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> Result = new ArrayList<>();
        List<Integer> Duplicated = new ArrayList<>();
        for (int i = 0; i < this.array.length; i++)
        {
            for (int j = 0; j < this.array[i].length; j++)
            {
                //Check new Integer is Exists before
                if (!Duplicated.contains(this.array[i][j]))
                {
                    Result.add(this.array[i][j]);
                    Duplicated.add(this.array[i][j]);
                }
            }

        }
        return Result;
    }
}
