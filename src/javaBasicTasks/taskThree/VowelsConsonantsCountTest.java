package javaBasicTasks.taskThree;

import java.util.Scanner;

public class VowelsConsonantsCountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.println("Enter your string to count vowels and consonants amount");

        try {
            str = scanner.nextLine();

            int counterV = 0;
            int counterC = 0;
            boolean onlyVowels = true;

            String temp = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if ((temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z') ||
                        (temp.charAt(i) >= 'а' && temp.charAt(i) <= 'я')) {
                    counterC++;
                    onlyVowels = false;
                }

                switch (temp.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                    case 'а':
                    case 'у':
                    case 'о':
                    case 'ы':
                    case 'э':
                    case 'я':
                    case 'ю':
                    case 'ё':
                    case 'и':
                    case 'е':
                        counterV++;
                        if (!onlyVowels) {
                            counterC--;
                            onlyVowels = true;
                        }
                        break;
                }
            }

            System.out.printf("Amount of vowels is %d\n", counterV);
            System.out.printf("Amount of consonants is %d\n", counterC);
        } catch (Exception ex) {
            System.err.println("Same thing was wrong, try later");
        }
    }
}

