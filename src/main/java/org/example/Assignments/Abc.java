package org.example.Assignments;

public class Abc {
    public static void main(String[] args) {

        int[] arr = {13, 19, 21, 27, 30};
        int target = 19;
        int index = findIndex(arr, target);
        System.out.println("The index of target in the sorted array is: " + index);

    }public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }


        }

        return -1;
    }

}
