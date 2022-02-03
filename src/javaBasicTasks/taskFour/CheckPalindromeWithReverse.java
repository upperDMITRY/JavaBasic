package javaBasicTasks.taskFour;

public class CheckPalindromeWithReverse {
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    public static int reverse(int number){
        int result = 0;
        while (number != 0) {
            result *=10;
            result += number % 10;
            number /=10;
        }
        return result;
    }
}
