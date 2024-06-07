package org.example.JavaPractice;
//Java program to sort strings in an array based on the length of the string using bubble
// sort algorithm. (Given Array - abdcr, bbhhyyy, abyss, abdcr, red, pink, blu)
public class BubbleSort {
public static void bubblesortByLength(String [] arr){
    int n = arr.length;
    boolean swapped;
    for(int i =0; i<n-1;i++){
        swapped  =false;
        for(int j =0; j<n-1-i;j++){
            if (arr[j].length()>arr[j+1].length())
            {
                String temp = arr[j];
                arr[j] =arr[j+1];
                arr[j+1] =temp;
                swapped= true;
            }
        }
        if(!swapped) break;
    }
}

    public static void main(String[] args) {
        String [] arr = {"abdcr", "bbhhyyy", "abyss", "abdcr", "red", "pink", "blu"};
        bubblesortByLength(arr);
        for(String str: arr)
        {
            System.out.print(str + " ");
        }
    }
}
