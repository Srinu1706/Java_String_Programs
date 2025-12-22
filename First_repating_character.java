package String_Level_2;

import java.util.HashSet;

public class First_repating_character {
    public static void main(String[] args) {
        String input="srinivas";
        char arr[]=input.toCharArray();
        HashSet<Character> c= new HashSet<>();
        boolean flag=false;
        for (int i=0;i<arr.length;i++){
        char ch=arr[i];
        if (c.contains(ch)){
            System.out.println("Fisrt repating character "+ch);
            flag=true;
            break;
        }else {
            c.add(ch);
        }


        }
        if (!flag){
            System.out.println("No repating character");
        }
    }
}
