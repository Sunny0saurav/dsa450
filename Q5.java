//move all negative element to one side
public class Q5 {
    static void sortArr(int[] arr,int n){
        int j=0,temp;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }

    }
    static void printArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] arr={-3,2,-1,4,5};
        sortArr(arr,5);
        printArray(arr,5);

    }
}
