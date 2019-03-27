package com.thoughtworks.collection;


import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        //throw new NotImplementedException();
        if (arrayList.isEmpty())
            return -1;
        int Max = 0;

        for (int x : this.arrayList)
        {
            if (Max < x)
                Max = x;

        }

        return Max;
    }

    public double getMinimum() {
        //throw new NotImplementedException();
        if (arrayList.isEmpty())
            return -1;
        int Min = arrayList.get(0);

        for (int x : this.arrayList)
        {
            if (Min > x)
                Min = x;

        }

        return Min;
    }

    public double getAverage() {
        //throw new NotImplementedException();
        double mean = 0.0;
        double sum = 0.0;

        for (int x : this.arrayList)
        {
            sum += x;
        }
        mean = sum / arrayList.size();
        return mean;

    }

    public double getOrderedMedian() {
        //throw new NotImplementedException();
        Collections.sort(arrayList);
        double Median = 0.0;
        if (arrayList.size() % 2 == 1)
        {
            Median = arrayList.get(arrayList.size()/2);
        }
        else
        {
            Median = arrayList.get(arrayList.size()/2) + arrayList.get(arrayList.size()/2-1);
            Median /= 2;
        }
        return Median;
    }

    public int getFirstEven() {
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (arrayList.get(i) % 2 == 0)
                return arrayList.get(i);
        }
        return -1;

    }

    public int getIndexOfFirstEven() {
        //throw new NotImplementedException();
        for (int i = 0; i < arrayList.size(); i++)
            if (arrayList.get(i) % 2 == 0)
                return i;
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        return this.arrayList.equals(arrayList);
    }






    public Double getMedianInLinkList(SingleLink singleLink) {

        int i = 0;
        double median = 0.0;

//        while (singleLink.hashCode())
//        {
//
//
//        }
//        System.out.println(singleLink.getNode(1));
//
//        if (i % 2 == 0)
//            median = singleLink.getNode(i) + singleLink.getNode((i-1));
//
//
        //singleLink.getNext()




        System.out.println("XXX");




        return median;
    }








    public int getLastOdd() {
        //throw new NotImplementedException();
        int Poisition = arrayList.size() - 1;
        for (int i = Poisition; i > 0; i++)
        {
            if (arrayList.get(i) % 2 == 1)
                return arrayList.get(i);
        }
        return -1;
    }

    public int getIndexOfLastOdd() {
        //throw new NotImplementedException();
        int Poisition = arrayList.size() - 1;
        for (int i = Poisition; i > 0; i++)
        {
            if (arrayList.get(i) % 2 == 1)
                return i;
        }
        return -1;
    }
}
