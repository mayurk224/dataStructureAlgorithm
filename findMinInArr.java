public class findMinInArr {
    public int findMinValueInArr(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is Empty");
        }
        int min = arr[0];
        for(int j: arr){
            if(j<min){
                min = j;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {};
        findMinInArr fma = new findMinInArr();
        System.out.println(fma.findMinValueInArr(arr));
    }
}