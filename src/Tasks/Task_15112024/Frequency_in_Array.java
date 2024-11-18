package Tasks.Task_15112024;

public class Frequency_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6};
        int max  = 0;
        for(int num:arr){
            if(num > max){
                max = num;
            }

        }
    }
}
