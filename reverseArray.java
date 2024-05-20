public class reverseArray {
    public static void printArray(int[] arr){
        for(int j : arr){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    public static void reverseArrayElements(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 7, 8, 9, 0};
        printArray(arr);
        reverseArrayElements(arr,0,arr.length-1);
        printArray(arr);
    }
}
