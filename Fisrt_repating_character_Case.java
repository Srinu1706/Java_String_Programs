package String_Level_2;

import java.util.HashSet;

public class Fisrt_repating_character_Case {
    public static void main(String[] args) {
        String input="Apple";
        char [] arr=input.toCharArray();
        HashSet<Character> set= new HashSet<>();
        boolean flag=false;
        for (int i=0;i<arr.length;i++){
            char word=arr[i];
            if (set.contains(word)){
                System.out.println("\"First repeating character "+word);
                flag =true;
                break;
            }
            else {
                set.add(word);
            }
        }
        if (!flag){
            System.out.println("no reapting character found");
        }

    }
}
