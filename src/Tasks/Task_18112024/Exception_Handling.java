package Tasks.Task_18112024;

public class Exception_Handling {
    public static void main(String[] args) {
        String s1 = "Chandan";
        try {
            String a1 = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try{
            String a = null;
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}
