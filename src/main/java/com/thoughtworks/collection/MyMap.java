package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        //throw new NotImplementedException();
        List<Integer> Result = new ArrayList<>();
        for (int x : this.array)
        {
            Result.add(3 * x);
        }

        return Result;
    }

    public List<String> mapLetter() {
        //throw new NotImplementedException();
        List<String> Result = new ArrayList<>();
        for (int i = 0; i < this.array.size(); i++)
            Result.add(letterList.get(i));
        return Result;

    }

    public List<String> mapLetters() {
        List<String> Result = new ArrayList<>();
        for (int i = 0; i < this.array.size(); i++)
        {
            if (array.get(i) < 27)
            {
                Result.add(letterList.get(array.get(i)-1));
            }
            else
            {
                int LetterReamin = this.array.get(i)-1;
                String tmp = "";
                //System.out.println("x:" + LetterReamin + " : " + LetterReamin/25);
                tmp += letterList.get(LetterReamin/26 -1);
                tmp += letterList.get(LetterReamin%26);
                Result.addAll(Arrays.asList(tmp));
            }

        }
        //String[] result = new String[]{"a", "m", "aa", "ad", "az", "ba"};
        //Result = Arrays.asList(result);
        return Result;
    }

    public List<Integer> sortFromBig() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
