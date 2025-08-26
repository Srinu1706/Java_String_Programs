package String_Level_1;

import java.util.Arrays;

public class Anagarams {
    public static void main(String[] args) {
        String s="listen";
        String s2="silent";
        char [] arr1=s.toCharArray();
        char [] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      if (Arrays.equals(arr1,arr2)){
          System.out.println("Both are anagarans");
      }
      else {
          System.out.println("not a angarams");
      }

    }
}




