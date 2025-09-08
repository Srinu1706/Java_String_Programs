package String_Level_2;

public class Camel_Case {
    public static void main(String[] args) {
        String sentence="HeY IAM srinIvaS BANdaru";
        String [] words=sentence.split(" ");
        StringBuilder camel= new StringBuilder();
        for (int i=0;i<= words.length-1;i++){
            String word=words[i];
          if (!word.isEmpty()){
              if (i==0){
                  camel.append(word.toLowerCase());
              }
              else {
                  camel.append(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
              }
          }
        }
        System.out.println("Camel Case: " + camel.toString());

    }
}
