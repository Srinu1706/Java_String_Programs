package String_Level_1;

public class Length_Without_InbuiltMethodes {
    public static void main(String[] args) {
        String name ="Srinivas";
        char arr []=name.toCharArray();
        int count=0;
        for (int i=0;i<=arr.length-1;i++){
            count=count+1;
        }
        System.out.println(count);
    }
}
