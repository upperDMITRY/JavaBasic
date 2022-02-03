package javaBasicTasks.taskTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

import static javaBasicTasks.taskTwo.CheckPalindrome.isPalindrome;
import static javaBasicTasks.taskTwo.ThreeDigitsCheck.hasThreeDigits;

public class CheckPalindromeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter your three digit number to determine whether is it palindrome number or not");

        while (true) {
            try {
                number = scanner.nextInt();
            }catch (InputMismatchException ex){
                System.err.println("You entered invalid data, try again");
                scanner.nextLine(); //очищаем буфер сканера
                continue;
            }
            if(!hasThreeDigits(number)){
                System.out.println("Your number has more than three digits, enter corresponding number");
                continue;
            }
            if(isPalindrome(number)){
                System.out.printf("Your number %d is palindrome", number);
            }else{
                System.out.printf("Your number %d is not palindrome", number);
            }
            break;
        }

    }
}
