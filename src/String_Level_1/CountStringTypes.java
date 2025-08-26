package String_Level_1;

public class CountStringTypes {
    public static void main(String[] args) {
        String s="Hello 1706@@@SRinivas Bandaru";
        int letters=0,spaces=0,digits=0,specials=0;
        for (int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if (Character.isLetter(ch)){
                letters++;
            }
            else if(Character.isWhitespace(ch)){
                spaces++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specials++;
            }
        }
        System.out.println(letters);
        System.out.println(spaces);
        System.out.println(digits);
        System.out.println(specials);
    }
}
