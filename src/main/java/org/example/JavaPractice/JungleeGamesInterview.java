package org.example.JavaPractice;

import java.util.Arrays;

public class JungleeGamesInterview {
    public static void main(String[] args) {
        int[] array = {13, 19, 21, 27, 30};
        int target = 31;
        int index =findInsertIndex (array, target);
        System.out.println("The index of target in the sorted array is: " + index);
        int [] newArray = new int[array.length + 1];
        for(int i =0,j=0;i<newArray.length ;i++)
        {
            if (i==index)
            {
                newArray[i] =target;
            }
            newArray[i] = array[j++];
        }
        System.out.println("The new array with "+target + "inserted is: " + Arrays.toString(newArray));

    }
    public static int findInsertIndex(int[] arr, int target){
        int left =0;
        int right =arr.length -1;
        while(left<=right)
        {
            int mid =left +(right -left)/2;
            if(arr[mid]== target)
            {
            return mid;
            }
            else if (arr[mid]<target){
            left = mid + 1;
        }
        else{
            right =mid -1;
        }
        }
        return left;
        }
    }

