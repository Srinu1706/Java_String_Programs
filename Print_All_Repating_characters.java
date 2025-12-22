package String_Level_2;

import java.util.HashSet;

public class Print_All_Repating_characters {
    public static void main(String[] args) {
        String input ="programming";
        char arr[]=input.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (Character word:arr){
            if (set.contains(word)){
                System.out.println("Repating characters "+word);
            }
            else {
                set.add(word);
            }
        }
    }
}
