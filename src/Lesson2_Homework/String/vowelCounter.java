package Lesson2_Homework.String;

public class vowelCounter {

    public static void main(String[] args) {

        String string = new String("w3resource");
        int vowelCount = 0;
        for (int i = 0; i < string.length(); i++) {
            switch(string.charAt(i)){
                case 'a':
                    vowelCount++;
                    break;
                case 'e':
                    vowelCount++;
                    break;
                case 'i':
                    vowelCount++;
                    break;
                case 'o':
                    vowelCount++;
                    break;
                case 'u':
                    vowelCount++;
                    break;
            }
        }
        System.out.println("Vowel count in " + string + " is: " + vowelCount);
    }
}
