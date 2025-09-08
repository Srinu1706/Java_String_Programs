    package String_Level_2;

    public class Snake_case {

        //never_give_up
        public static void main(String[] args) {
            String sentence="Never Give Up".toLowerCase();
            String [] words=sentence.split(" ");
            StringBuilder snake=new StringBuilder();
            for(int i=0;i<= words.length-1;i++){
                String word=words[i];
                snake.append(word);
            if (i<words.length-1){
                snake.append("_");
            }
            }
            System.out.println(snake);
        }
    }
