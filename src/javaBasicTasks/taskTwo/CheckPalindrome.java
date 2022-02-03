package javaBasicTasks.taskTwo;

public class CheckPalindrome {
    public static boolean isPalindrome(int num){
        int result = 0;
        int temp = num;
        while (temp != 0) {
            result *=10;
            result += temp % 10;
            temp /=10;
        }

        return num == result;
    }
}
