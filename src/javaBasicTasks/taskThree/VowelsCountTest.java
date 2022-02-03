package javaBasicTasks.taskThree;

import java.util.Scanner;

import static javaBasicTasks.taskThree.VowelsCount.vowelsCount;

public class VowelsCountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr;

        System.out.println("Enter your string to count vowels amount");

            try {
                inputStr = scanner.nextLine();
                System.out.printf("Amount of vowels is %d", vowelsCount(inputStr));
            }catch (Exception ex){
                System.err.println("Same thing was wrong, try later");
            }
    }
}
