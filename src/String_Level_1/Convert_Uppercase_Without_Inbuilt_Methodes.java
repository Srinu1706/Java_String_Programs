package String_Level_1;

public class Convert_Uppercase_Without_Inbuilt_Methodes {
    public static void main(String[] args) {
        String alice ="alice";
        String john="JOHN";
        String uppercase="";
        String lowercase="";
        for (int i=0;i<=alice.length()-1;i++){
            char ch=alice.charAt(i);
            if (ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
            }
            uppercase+=ch;
        }
        for (int i=0;i<=john.length()-1;i++){
            char ch=john.charAt(i);
            if (ch>='A'&&ch<='Z'){
                ch=(char) (ch+32);
            }
            lowercase=lowercase+ch;

        }
        System.out.println(uppercase);
        System.out.println(lowercase);
    }
}

