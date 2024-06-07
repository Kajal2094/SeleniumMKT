package org.example.Interviews;

public class StarHealthInterview {
    public static int [] mergedSortedArrays(int [] arr1, int [] arr2)
    {
        int [] mergedArray = new int[arr1.length +arr2.length];
        int i =0,j=0,k=0;

        while (i< arr1.length && j < arr2.length)
        {
            if (arr1[i]<arr2[j])
            {
                mergedArray[k++]= arr1[i++];

            }
            else {
                mergedArray[k++] =arr2[j++];
            }
        }
        while  (i< arr1.length)
        {
            mergedArray[k++] =arr1[i++];
        }

        while (j<arr2.length)
        {
            mergedArray[k++] = arr2[j++];

        }
        return mergedArray;

    }

    public static void main(String[] args) {
        int [] array1 = {1,3,5};
        int [] array2 = {2,4,6};
        int [] mergeResult  = mergedSortedArrays(array1, array2);
        for (int num : mergeResult)
        {
            System.out.print(num +" ");
        }

    }
}
