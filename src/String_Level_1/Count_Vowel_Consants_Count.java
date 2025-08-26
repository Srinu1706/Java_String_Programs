package String_Level_1;

public class Count_Vowel_Consants_Count {
    public static void main(String[] args) {
        String s="SRINIVAS".toLowerCase();
        int vowelcount=0;
        int consantcount=0;
        for (int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelcount++;
            }
            else{
                consantcount++;
            }
        }
        System.out.println(vowelcount);
        System.out.println(consantcount);


    }
}
