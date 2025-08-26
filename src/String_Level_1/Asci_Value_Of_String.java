package String_Level_1;

public class Asci_Value_Of_String {
    public static void main(String[] args) {
        String a = "MAHESH babu";
        for(int i=0;i<=a.length()-1;i++){
           char s= a.charAt(i);
          int asc = (int) s;
            System.out.println(s +" -> "+ asc);
        }

    }
}
