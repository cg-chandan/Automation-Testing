package Tasks.Task_22102024;

public class Palindrome_string {
    public static void main(String[] args) {
        String str = "bangalore";
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2 ; i++) {
                char start = str.charAt(i);
                char end = str.charAt(str.length()-1-i);
                if(start!=end){
                    System.out.println(str+" is not a palindrome");
                    break;
                } else{
                    String result= String.format("%s is Palindrome",str);
                    System.out.println(result);
                    break;

                }
        }
    }
}
