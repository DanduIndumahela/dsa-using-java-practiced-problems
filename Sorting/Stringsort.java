package Sorting;

import java.util.Arrays;

public class Stringsort {
    public static void main(String[] args) {
        String[] arr={"indu","dsa"};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(String []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j].length() <arr[j-1].length()){
                    String temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
