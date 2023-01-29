package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputToArrayMain {
    static Scanner scanInput = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> outputArray = new ArrayList<>();
        while (scanInput.hasNext()) {
            outputArray.add(scanInput.next());
            System.out.println("Current Array: " + outputArray);
        }
    }
}
