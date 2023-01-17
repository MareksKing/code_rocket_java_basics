package Lesson2_Homework.String;

import java.util.Arrays;

public class FriendList {
    public static void main(String[] args) {
        String[] friendList = {"Emīls", "Daniels", "Vilnis", "Mārtiņš", "Igors", "Oskars", "Viktors", "Sethupathi", "Uldis", "Jānis"};
        Arrays.stream(friendList).sorted().forEach(System.out::println);
    }
}
