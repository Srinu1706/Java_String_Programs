package String_Level_2;

public class PascalCase {
    public static void main(String[] args) {
        String sentence="Hey Iam Java Developer";
        String [] words=sentence.split(" ");
        StringBuilder PascalCase= new StringBuilder();
        for (int i=0;i<= words.length-1;i++){
            String word=words[i];
            if (i==0){
                PascalCase.append(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
            }
            else {
                PascalCase.append(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
            }
        }
        System.out.println("PascalCase "+ PascalCase.toString());
    }
}
