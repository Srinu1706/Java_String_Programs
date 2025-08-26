package String_Level_1;

public class Reverse_A_String {
    public static void main(String[] args) {
        String orginal="Saalar";
        String reverse="";
        for (int i=orginal.length()-1;i>=0;i--){
             reverse=reverse+orginal.charAt(i);
        }
        System.out.println(reverse);
    }
}
