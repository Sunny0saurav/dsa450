//find max min element with index
public class Q3 {
    static void maxMin_kth(int[]arr,int size) {
        int max = arr[0], min = arr[0], kmax = 0, kmin = 0;
        for (int i = 0; i<size;i++){
            if(arr[i]>max){
                max=arr[i];
                kmax=i+1;
            }
            if(arr[i]<min){
                min=arr[i];
                kmin=i+1;
            }
        }
        System.out.println(kmax+"th element has max value:-"+max);
        System.out.println(kmin+"th element has min value:-"+min);
    }
    static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String args[]){
        int[] arr={1000,11,445,1,330,3000};
        maxMin_kth(arr,6);
        printArray(arr,6);
    }

}
