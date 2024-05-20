// que: string - madam , in reverse order also its same
public class palindromeString {
    public boolean checkPalindrom(String word){
        char[] charArr = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(charArr[start]!=charArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "heleh";
        palindromeString ps = new palindromeString();
        System.out.println(ps.checkPalindrom(s));
    }
}
