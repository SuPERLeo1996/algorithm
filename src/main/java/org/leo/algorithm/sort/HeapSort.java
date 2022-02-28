package org.leo.algorithm.sort;

public class HeapSort {
    public static void main(String[] args) {
        int[] result = {2, 4, 1, 3, 6, 5};
        System.out.println("----快速排序前顺序----");
        for (int i : result) {
            System.out.print(i);
        }
        heapSort(result);

        System.out.println();
        System.out.println("----快速排序后结果----");
        for (int i : result) {
            System.out.print(i);
        }
    }

    private static void heapSort(int[] arr) {
        //创建堆
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            adjustHeap(arr, 0, i);
        }
    }

    private static void adjustHeap(int[] arr, int parent, int length) {
        int temp = arr[parent];
        int leftChild = 2 * parent + 1;
        while (leftChild < length) {
            int rightChild = leftChild + 1;
            if (rightChild < length && arr[leftChild] < arr[rightChild]) {
                leftChild++;
            }

            if (temp >= arr[leftChild]) {
                break;
            }

            arr[parent] = arr[leftChild];

            parent = leftChild;
            leftChild = 2 * leftChild + 1;
        }

        arr[parent] = temp;
    }
}
