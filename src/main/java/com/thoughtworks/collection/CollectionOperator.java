package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        List<Integer> Result = new ArrayList<>();
        if (left < right)
            for (int i = left; i <= right; i++)
                Result.add(i);
        else
            for (int i = left; i >= right; i--)
                Result.add(i);
        return Result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> Result = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++)
                if (i % 2 == 0)
                    Result.add(i);
        }
        else {
            for (int i = left; i >= right; i--)
                if (i % 2 == 0)
                    Result.add(i);
        }
        return Result;
    }

    public List<Integer> popEvenElments(int[] array) {
        if (array.length == 0)
            return null;

        List<Integer> Result = new ArrayList<>();
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                Result.add(array[i]);
        return Result;
    }

    public int popLastElment(int[] array) {
        if (array.length == 0)
            return 0;
        int LstElmt = 0;
        return array[array.length - 1];

    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> commonElements = new ArrayList<Integer>();
        for(int i = 0; i < firstArray.length ;i++)
            for(int j = 0; j< secondArray.length ; j++)
                if(firstArray[i] == secondArray[j])
                    if(!commonElements.contains(firstArray[i]))
                        commonElements.add(firstArray[i]);

        return commonElements;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> commonElements = new ArrayList<Integer>();
        List<Integer> UncommonElements = new ArrayList<Integer>();
        List<Integer> tmp = new ArrayList<Integer>();
        for(int i = 0; i < firstArray.length ;i++)
            for(int j = 0; j< secondArray.length ; j++)
                if(firstArray[i] == secondArray[j])
                    if(!commonElements.contains(firstArray[i]))
                        commonElements.add(firstArray[i]);
        //find the common Elements
        //Add the first array into the list
        //delete the common elements from the second list
        //add the second list at the end of the first
        UncommonElements.addAll(Arrays.asList(firstArray));
        tmp.addAll(Arrays.asList(secondArray));
        tmp.removeAll(commonElements);
        UncommonElements.addAll(tmp);
        //an unordered list cannot pass test.
        return UncommonElements;
    }
}
