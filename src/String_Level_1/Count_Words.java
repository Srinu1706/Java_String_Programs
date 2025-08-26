package String_Level_1;

public class Count_Words {
    public static void main(String[] args) {
        String s="Bahuabali Bhallaladeva Devasena Avanthika Sivagami Kattappa Bijjaladeva ".trim();
        int count=1;
        for (int i=0;i<=s.length()-1;i++){
            if (s.charAt(i)==' '&&s.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
