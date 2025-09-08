package String_Level_2;

public class Vowels_And_Consantants2 {
    public static void main(String[] args) {
        String word="Looser".toLowerCase();
        char array []=word.toCharArray();
        int vowel=0;
        int consonants=0;
        for ( char c:array){
            if (c>='a'&& c<='z'){
                if ("aeiou".indexOf(c)!=-1){
                    vowel++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("vowel count "+vowel);
        System.out.println("consonants count "+ consonants);
    }
}
