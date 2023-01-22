package com.ryuu;

public class Main {

    public static void main(String[] args) {

        //1. while loop
	    int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        //2. for loop
        for(int i=6; i!= 6; i++) {
            System.out.println("Count value is " + count);
        }

        //3. do while loop
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count >6) {
                break;
            }
        } while(count != 6);


        //4. do while loop
//        int number = 1;
//        int finishNumber = 6;
//        while(number < finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }


        //5. more
//        int number = 5;
//        int finishNumber = 20;
//        int evenNumbersFound = 0;
//        while(number <= finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//
//            evenNumbersFound++;
//            if(evenNumbersFound >=5) {
//                break;
//            }
//        }
//
//        System.out.println("Total even numbers found = " + evenNumbersFound);
//
//
    }


    public static boolean isEvenNumber(int number) {
        if((number % 2)  == 0) {
            return true;
        } else {
            return false;
        }
    }

}
