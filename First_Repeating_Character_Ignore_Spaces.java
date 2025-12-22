package String_Level_2;

import java.util.HashSet;

public class First_Repeating_Character_Ignore_Spaces {
    public static void main(String[] args) {
        String input="a b c a d";
        char [] alphabets=input.toCharArray();
        HashSet<Character> set= new HashSet<>();
        boolean flag= false;
        for (int i=0;i<alphabets.length;i++){
            char alphabet=alphabets[i];
            if (alphabet==' '){
                continue;
            }
            if (set.contains(alphabet)){
                System.out.println("Fisrt repating alphabet "+alphabet );
                break;
            }
            else {
                set.add(alphabet);
            }
        }

    }
}
