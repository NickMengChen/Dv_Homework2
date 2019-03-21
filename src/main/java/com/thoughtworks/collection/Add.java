package com.thoughtworks.collection;

import java.util.*;

public class Add {


    public int getSumOfEvens(int leftBorder, int rightBorder) {
        //check left & right border
        if (leftBorder > rightBorder)
        {
            int tmp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tmp;
        }
        //fix border
        int SumOfEven = 0;
        if (leftBorder % 2 == 1)
            leftBorder++;
        if (rightBorder % 2 == 1)
            rightBorder--;
        //get the SumOfEven
        for (int i = leftBorder; i <= rightBorder; i++)
        {
            SumOfEven += i;
            i++;
        }
        return SumOfEven;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        //check left & right border
        if (leftBorder > rightBorder)
        {
            int tmp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tmp;
        }
        //fix border
        int SumOfOdd = 0;
        if (leftBorder % 2 == 0)
            leftBorder++;
        if (rightBorder % 2 == 0)
            rightBorder--;
        //get the SumOfOdd
        for (int i = leftBorder; i <= rightBorder; i++)
        {
            SumOfOdd += i;
            i++;
        }
        return SumOfOdd;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        if (arrayList.isEmpty())
            return 0;
        int Result = 0;
        for (int i = 0; i < arrayList.size(); i++)
            Result += arrayList.get(i) * 3 + 2;
        return Result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        if (arrayList.isEmpty())
            return null;
        int i = 0;
        for (int x : arrayList)
        {
            if (x % 2 == 1)
                arrayList.set(i, arrayList.get(i) * 3 + 2);
            i++;
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        if (arrayList.isEmpty())
            return 0;
        int SumOfOdd = 0;
        int i = 0;
        for (int x : arrayList)
        {
            if (x % 2 == 1)
                //arrayList.set(i, arrayList.get(i) * 3 + 2);
                SumOfOdd += arrayList.get(i) * 3 + 5;
            i++;
        }
        return SumOfOdd;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        //throw new NotImplementedException();
        //List<Integer> Result;
        if (arrayList.size() < 3 || arrayList.isEmpty())
            return 0;
        double Median = 0.0;
        if (arrayList.size() % 2 == 0)
            Median = arrayList.get(arrayList.size()/2);
        if (arrayList.size() % 2 == 1)
        {
            int left = arrayList.get(arrayList.size() / 2 - 1);
            int right = arrayList.get(arrayList.size() / 2 + 1);
            Median = (left + right) / 2;
        }
        return Median;
    }

        public double getAverageOfEven(List<Integer> arrayList) {
            if (arrayList.isEmpty())
                return 0;
            int i = 0;
            int count = 0;
            double sum = 0.0;
            double mean = 0.0;
            for (i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0) {
                    sum += arrayList.get(i);
                    count++;
                }
            }
            mean = sum / count;
            return mean;
        }

        public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
            if (arrayList.isEmpty() || arrayList.size() <1)
                return false;
            if (specialElment % 2 == 1)
                return false;
            for (int i = 0; i < arrayList.size(); i++)
                if (arrayList.get(i) == specialElment)
                   return true;
            return false;
        }

        public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
                List<Integer> Result = new ArrayList<>();
                List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(arrayList));
                for (int x : listWithoutDuplicates)
                    if (x % 2 == 0)
                        Result.add(x);
                return Result;
        }

        public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
            //find the even, find the odd, sort, combine
            //Linked list would be easier
            List<Integer> Result = new ArrayList<>();
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++)
            {
                if(arrayList.get(i) % 2 == 0)
                    left.add(arrayList.get(i));
                else
                    right.add(arrayList.get(i));
            }
            Collections.sort(left);
            Collections.sort(right, Collections.reverseOrder());
            Result.addAll(left);
            Result.addAll(right);
            return Result;
        }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        if (arrayList.isEmpty())
            return null;
        List<Integer> Result = new ArrayList<>();
        int ArraySize = arrayList.size();
        for (int i = 0; i < ArraySize-1; i++)
        {
            int y = (arrayList.get(i)+arrayList.get(i+1))*3;
            Result.add(y);
        }
        return Result;
    }
}
