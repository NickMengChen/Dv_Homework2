package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        //throw new NotImplementedException();
        List<Integer> Result = new ArrayList<>();
        for (int x : this.array)
            if (x % 2 == 0)
                Result.add(x);

        return Result;
    }

    public List<Integer> filterMultipleOfThree() {
        //throw new NotImplementedException();
        List<Integer> Result = new ArrayList<>();
        for (int x : this.array)
            if (x % 3 == 0)
                Result.add(x);
        return Result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        //throw new NotImplementedException();
        if (firstList.isEmpty() || secondList.isEmpty())
            return null;
        List<Integer> commonElements = new ArrayList<Integer>();
        for(int i = 0; i < firstList.size() ;i++)
            for(int j = 0; j< secondList.size() ; j++)
                if(firstList.get(i) == secondList.get(j))
                    if(!commonElements.contains(firstList.get(i)))
                        commonElements.add(firstList.get(i));
        return commonElements;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(this.array));
        return listWithoutDuplicates;
    }
}