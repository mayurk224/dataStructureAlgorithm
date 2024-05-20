// ex : {1,2,3,4,0,5,0,3,0,0,5}
// ans :{1,2,3,4,5,3,5,0,0,0,0}
public class zeroToEnd {
    public void printArr(int[] arr){
        int n = arr.length;
        for(int j : arr){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[]  arr = {8,1,0,2,1,0,3};
        printArr(arr);
        moveZeros(arr,arr.length);
        printArr(arr);
    }
    public void moveZeros(int[] arr, int n){
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]!=0 && arr[j] ==0){
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] =temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,4,12,0};
        zeroToEnd arrUtil = new zeroToEnd();
        arrUtil.arrayDemo();
    }
}
