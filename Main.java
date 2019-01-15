package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] A = {7, 2, 1, 6, 8, 5, 3, 4};
        quickSort(A, 0, 7);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
    public static void quickSort(int[] A, int start, int end) {
        int pivot;
        if (start < end) {
            //recursive functions
            pivot = partition(A, start, end);
            quickSort(A, start, pivot - 1);
            quickSort(A, pivot + 1, end);
        }
    }

    // 7 2 1 6 8 5 3 4
    // 2 1 3 6 8 5 7 4 pIndex= 3
    public static int partition(int[] A, int start, int end) {
        int pivot = A[end];
        int pIndex = start - 1;
        for (int i = start; i < end; i++) {
            if (A[i] <= pivot) {
                pIndex++;

                int temp = A[pIndex];
                A[pIndex] = A[i];
                A[i] = temp;
            }
        }
        int temp = A[pIndex + 1];
        A[pIndex + 1] = A[end];
        A[end] = temp;
        return pIndex + 1;
    }
}
