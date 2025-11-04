package Java.SortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class MaxHeap {
    int capacity;
    int size;
    int[] heap;

    MaxHeap(int c){
        this.capacity = c;
        heap = new int[c];
        this.size = 0;
    }
    private void swap(int l, int r){
        int temp = heap[l];
        heap[l] = heap[r];
        heap[r] = temp;
    }
    int parent(int i) {return (i-1)/2;}
    int leftChild(int i){return (2*i + 1);}
    int rightChild(int i){return (2*i + 2);}

    void insert(int element){
        // check if the heap is full or not
        if(this.size == capacity){
            System.out.println("Keya kar raha hai bhai! Heap is already full😒");
            return;
        }
        this.heap[this.size] = element;
        this.size++;
        heapifyUp(element);
    }
    void heapifyUp(int element){
        int i = size - 1;
        while(heap[parent(i)] < element && i != 0){
            swap(parent(i), i);
            i = parent(i);
        }
    }
    int getMax(){
        if(size == 0){
            System.out.println("Bhai Heap a kono element nai tao toke ami akta value dilam khsuh thak!🫡");
            return Integer.MAX_VALUE;
        }
        int max = heap[0];
        swap(0, size - 1);
        size--;
        heapifyDown(0);
        return max;
    }
    void heapifyDown(int i){
        int largestElementIndex = i;
        int lcIndex = this.leftChild(i);
        int rcIndex = this.rightChild(i);

        if(lcIndex < size && heap[i] < heap[lcIndex]){
            largestElementIndex = lcIndex;
        }
        if(rcIndex < size && heap[largestElementIndex] < heap[rcIndex]){
            largestElementIndex = rcIndex;
        }

        if(largestElementIndex != i){
            swap(largestElementIndex, i);
            heapifyDown(largestElementIndex);
        }
    }
    void showHeap(){
        System.out.println("Your heap is :" + Arrays.toString(heap));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter capacity of heap : ");
        int c = sc.nextInt();
        MaxHeap mxHeap = new MaxHeap(c);
        // inserting elements to the heap------------
        mxHeap.insert(10);
        mxHeap.insert(20);
        mxHeap.insert(30);
        mxHeap.insert(31);
        mxHeap.insert(10);
        mxHeap.insert(25);
        mxHeap.insert(50);
        mxHeap.insert(35);
        mxHeap.showHeap();

        // sorting the array or heap------------------
        for(int i = 0; i < 9; i++){
            System.out.println(mxHeap.getMax());
        }
        System.out.println("After sorting the heap is looks like : ");
        mxHeap.showHeap();
    }
}
