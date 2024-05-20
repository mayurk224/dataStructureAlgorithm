public class resizeArray {
    public void printArr(int[] arr){
        int n = arr.length;
        for (int j : arr){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        //for(int i = 0; i < arr.length; i++){
        //            temp[i] = arr[i];
        //        }
        System.arraycopy(arr, 0, temp, 0, arr.length);
//        arr = temp;
//        return arr;
        return temp;
    }
    public static void main(String[] args) {
        resizeArray ra = new resizeArray();
        ra.printArr(new int[] {5,1,2,9,10});
        int[] original = new int[] {5,1,2,9,10};
        System.out.println("size of original array "+original.length);
        original=ra.resize(original,10);
        System.out.println("size of resize array "+original.length);
    }
}
