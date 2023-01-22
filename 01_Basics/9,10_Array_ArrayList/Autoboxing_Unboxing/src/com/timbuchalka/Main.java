package com.timbuchalka;

import java.util.ArrayList;


class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}



public class Main {
    public static void main(String[] args) {
	    String[] strArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> strArrayList = new ArrayList<String>();

        strArrayList.add("Ryuu");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//        for(int i=0; i<=10; i++) {
//            intArrayList.add(Integer.valueOf(i));
//        }
//
//        for(int i=0; i<=10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue.intValue(); // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + "  --> " + value);
        }
    }
}




/*
    int n1 = 10;
    long n2 = 20;
    double n3 = 10.10;
    float n4 = 20.20f;

    // Autoboxing  (assign datatype automatically)
    Integer a1 = n1;
    Long a2 = n2;
    Double a3 = n3;
    Float a4 = n4;

    Integer a1 = Integer.valueOf(10);
    Long a2 = Long.valueOf(20);
    Double a3 = Double.valueOf(10.10);
    Float a4 = Float.valueOf(20.20f);

    // Unboxing (assign datatype manually)
    int b1 = a1;
    long b2 = a2;
    double b3 = a3;
    float b4 = n4;
 */