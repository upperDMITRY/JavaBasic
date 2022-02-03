package javaBasicTasks.taskThree;

public class VowelsCount {
    public static int vowelsCount(String str){
        int counter = 0;
        String temp = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
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
                    counter++;
                    break;
            }
        }
        return counter;
    }
}
