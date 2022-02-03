package javaBasicTasks.taskTwo;

public class ThreeDigitsCheck {
    public static boolean hasThreeDigits(int num){
        int count = (num == 0) ? 1 : 0;
        while (num != 0) {
            count++;
            num /= 10;
        }

        return count <= 3;
    }
}
