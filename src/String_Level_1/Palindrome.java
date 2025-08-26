package String_Level_1;

public class Palindrome {
    public static void main(String[] args) {
        String string="MALAYALAM";
        String temp="";
        for (int i=string.length()-1;i>=0;i--){
            temp=temp+string.charAt(i);
        }
        if (string.equals(temp)){
            System.out.println("Both are palindrome");
        }
    }
}
