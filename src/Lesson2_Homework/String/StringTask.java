package Lesson2_Homework.String;



public class StringTask {
    
    public static void main(String[] args) {
        
        String refrigerator = new String("refrigerator");
        String umbrella = new String("umbrella");
        String orange = new String("This is orange juice");
        String helloWorld = new String("Hello, world");

        System.out.println("The length of the String: " + refrigerator + " is " + refrigerator.length());
        System.out.println("Does the word " + umbrella + " contain the letter e? " + umbrella.contains("e"));
        System.out.println("Does the sentence :" +'"' + orange +  '"' + " contain the word orange? " + orange.contains("orange"));

        char[] charHelloWorld = helloWorld.toCharArray();
        int firstOPosition = 0, lastOPosition = 0;
        
        for (int i = 0; i < charHelloWorld.length; i++) {
            if(charHelloWorld[i] == 'o' && firstOPosition == 0){
                firstOPosition = i;
            } else if(charHelloWorld[i] == 'o'){
                lastOPosition = i;
            }
        }
        System.out.println(firstOPosition + " " + lastOPosition);
    }
}
