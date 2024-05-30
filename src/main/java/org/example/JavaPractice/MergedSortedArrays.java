package org.example.JavaPractice;

    public class MergedSortedArrays {
        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7};
            int[] arr2 = {2, 4, 6, 8, 10};
            int[] mergedArray = mergeArrays(arr1, arr2);
            System.out.print("Merged Array: ");
            for (int num : mergedArray) {
                System.out.print(num + " ");
            }
        }

        public static int[] mergeArrays(int[] arr1, int[] arr2) {
            int[] mergedArray = new int[arr1.length + arr2.length];
            int i = 0, j = 0, k = 0;

            // Merge arrays until one of them is fully traversed
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    mergedArray[k++] = arr1[i++];
                } else {
                    mergedArray[k++] = arr2[j++];
                }
            }

            // Copy the remaining elements from arr1, if any
            while (i < arr1.length) {
                mergedArray[k++] = arr1[i++];
            }

            // Copy the remaining elements from arr2, if any
            while (j < arr2.length) {
                mergedArray[k++] = arr2[j++];
            }

            return mergedArray;
        }
    }



