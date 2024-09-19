package com.anonymous.p1;

/**
 * Description of the class or purpose.
 *
 * @author ASUS
 * @date 9/19/2024
 */
public class SubArrayI {
    public static void subArray(int number[]){
        int total_subarray = 0;

        for(int i = 0; i<number.length;i++){ //outer loop
            int start = i;
            for(int j = i; j<number.length;j++){ //inner loop
                int end = j;
                int sum = 0;
                for(int k = start; k<=end;k++){
                    System.out.print(number[k]+ " "); //print the subarray
                    sum += number[k];
                }
                total_subarray++;
                System.out.println();

                System.out.println("Sum of the subarray = " + sum);
            }
            System.out.println();
        }
        System.out.println("Total possible sub-arrays are = " + total_subarray);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        subArray(number);
    }
}

