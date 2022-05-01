import javax.swing.*;
//find max min of an array
public class Q2 {
    static void maxMinArray(int[] arr,int size){
        int max=arr[0],min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
    static void PrintArray(int[] arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] arr={1000,11,445,1,330,3000};
        maxMinArray(arr,6);
        PrintArray(arr,6);
    }
}
