package String_Level_2;

import java.util.HashMap;

public class First_Non_Repating_character {
    public static void main(String[] args) {
        String input="aabbcde";
        char arr[]=input.toCharArray();
        HashMap<Character,Integer> map= new HashMap<>();
        for ( char c:arr){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        for (char c:arr){
            if(map.get(c)==1){
                System.out.println("first non repating character "+c);
                break;
            }
        }
    }
}
