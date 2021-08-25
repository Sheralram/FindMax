package com.Bridgelabz.max;

import java.util.ArrayList;
import java.util.Collections;

public class FindMax <T extends Comparable<T>> {

    ArrayList<T> list = new ArrayList<T>();
    //contructor accept multiple arguments
    FindMax(T... inputs){
        for (T value : inputs){
            this.list.add(value);
        }
    }

        public T testMaximum() {
            return FindMax.testMaximum(list);
        }

    public static <T extends Comparable<T>> T testMaximum(ArrayList<T> list) {
        // Sort the list in ascending order
        Collections.sort(list);
        // last position holds the max value
        T maxValue = list.get(list.size() - 1);
        showMaxValue(list,maxValue);
        return maxValue;
    }


    public static <T> void showMaxValue(ArrayList<T> list,T maxValue) {
        System.out.println("\nInput values : ");
        for (T value : list){
            System.out.print(value +" , ");
        }
        System.out.println("\nMaximum : " + maxValue);
    }



    private static <T extends Comparable<T>> void showMaxValue(T num1, T num2, T num3, T max) {
        System.out.println("the input1 is "+num1+"\ninput2 is "+num2+"\ninput3 is "+num3);
        System.out.println("Maximum : " + max+"\n");
    }
    public static void main(String[] args) {
        Integer intValue1 = 300 , intValue2 = 900 , intValue3 = 60, intValue=270;
        Float floatValue1 = 9.3f , floatValue2 = 3.5f , floatValue3 = 8.7f, floatValue = 9.6f;
        String stringValue1 = "Mango" , stringValue2 = "Orange" , stringValue3 = "PineApple" , stringValue4 = "apple";


        new FindMax<>(intValue1, intValue2, intValue3,intValue).testMaximum();
        new FindMax<>(floatValue1, floatValue2, floatValue3,floatValue).testMaximum();
        new FindMax<>(stringValue1, stringValue2, stringValue3,stringValue4).testMaximum();
    }

}
