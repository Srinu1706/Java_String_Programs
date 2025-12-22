package String_Level_2;

import java.util.HashSet;

public class Fisrt_repating_word {
    public static void main(String[] args) {
        String sentence ="java is easy and java is powerful";
        String words []=sentence.split(" ");
        HashSet<String> set= new HashSet<>();
        boolean flag=false;
        for (int i=0;i<words.length;i++){
            String word=words[i];
            if (set.contains(word)){
                System.out.println("Fisrt repating word "+word);
                flag =true;
                break;
            }
            else {
                set.add(word);
            }
        }
        if (!flag){
            System.out.println("There is no word");
        }
    }
}
