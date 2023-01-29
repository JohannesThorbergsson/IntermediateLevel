package org.example;

public class NumbersArray {

    final String[] NUMBERS_ARRAY = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    public String getNumberString(int i) {
        return NUMBERS_ARRAY[i-1];
    }

    public String[] oneToHundred() {
        String[] numArray = new String[100];
        for (int i =1; i<101; i++) {
            if(i%3 == 0) {
                numArray[i-1] = "#"+ i;
            } else if (i%5==0) {
               numArray[i-1] = "$"+ i;
            } else {
                numArray[i-1] = Integer.toString(i);
            }
        }
        return numArray;
    }
}
