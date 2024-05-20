public class removeEven{
    public static void printArr(int[] arr){
        for(int j : arr){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    public static int[] removeEvenElements(int[] arr){
        int oddCount = 0;
        for( int j : arr){
            if(j%2!=0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int indx = 0;
        for(int j : arr){
            if(j%2!=0){
                result[indx] = j;
                indx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        printArr(arr);
        printArr(removeEvenElements(arr));
    }
}