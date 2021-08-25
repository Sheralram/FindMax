package com.Bridgelabz.max;

public class FindMax {

    public Integer maxNum(Integer input1, Integer input2, Integer input3){
        Integer max = input1;
        if(input2.compareTo(max) > 0)
            max = input2;
        if(input3.compareTo(max) > 0)
            max = input3;
        System.out.println("maximum of three integer is "+max);
        return max;
    }

    public Float maxNum(Float input1, Float input2, Float input3){
        Float max = input1;
        if(input2.compareTo(max) > 0)
            max = input2;
        if(input3.compareTo(max) > 0)
            max = input3;
        System.out.println("maximum of three float is "+max);
        return max;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum using Generics");
      FindMax maximum=new FindMax();
        maximum.maxNum(2,5,8);
        maximum.maxNum(7.5f,9.2f,6.1f);

    }
}
