package leet_code;

public class NumberOfOperations {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,2,3,4}));
        System.out.println(minimumOperations(new int[]{3,6,9}));
    }
    public static int minimumOperations(int[] nums) {
        int num=0;
        for (int i : nums){
            if(i%3 != 0){
                num++;
            }
        }
        return num;
    }
}
