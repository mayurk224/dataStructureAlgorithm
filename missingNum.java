//formula : n(n+1)/2

public class missingNum {
    public int findMissingNum(int[] arr){
        int n = arr.length+1;
        int sum = n * (n+1)/2;
        for(int num : arr){
            sum -= num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,7};
        missingNum mn = new missingNum();
        System.out.println(mn.findMissingNum(arr));
    }
}
