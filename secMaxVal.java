public class secMaxVal {
    public int secMaxValInArr(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int j : arr){
            if(j>max){
                secMax = max;
                max = j;
            } else if (j>secMax && j != max) {
                secMax = j;
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,9};
        secMaxVal smv = new secMaxVal();
        System.out.println(smv.secMaxValInArr(arr));
    }
}
