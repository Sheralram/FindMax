package com.Bridgelabz.max;

public class FindMax <T extends Comparable<T>> {
    T input1, input2, input3;
        public FindMax(T input1, T input2, T input3) {
            this.input1 = input1;
            this.input2 = input2;
            this.input3 = input3;
        }

        public T testMaximum() {
            return FindMax.getMax(input1,input2,input3);
        }




    public static <T extends Comparable<T>> T getMax(T num1,T num2,T num3){         //Refactor all 3 in one Generic Method
        T max=num1;
        if(num2.compareTo(max)>0)
            max=num2;
        if(num3.compareTo(max)>0)
            max=num3;
        showMaxValue(num1, num2, num3, max);
        return max;
    }


    private static <T extends Comparable<T>> void showMaxValue(T num1, T num2, T num3, T max) {
        System.out.println("the input1 is "+num1+"\ninput2 is "+num2+"\ninput3 is "+num3);
        System.out.println("Maximum : " + max+"\n");
    }
    public static void main(String[] args) {
        Integer intValue1 = 300 , intValue2 = 900 , intValue3 = 60;
        Float floatValue1 = 9.3f , floatValue2 = 3.5f , floatValue3 = 8.7f;
        String stringValue1 = "Mango" , stringValue2 = "Orange" , stringValue3 = "PineApple";


        new FindMax<>(intValue1, intValue2, intValue3).testMaximum();
        new FindMax<>(floatValue1, floatValue2, floatValue3).testMaximum();
        new FindMax<>(stringValue1, stringValue2, stringValue3).testMaximum();
    }

}
