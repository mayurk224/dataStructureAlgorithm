public class lenOfLongSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        boolean[] visited = new boolean[256]; // Assuming ASCII characters

        int maxLength = 0;
        int start = 0;

        // Iterate through the string
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            // If the character is already visited, move the start pointer
            while (visited[currentChar]) {
                visited[s.charAt(start)] = false;
                start++;
            }
            // Mark the current character as visited
            visited[currentChar] = true;
            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "welcome";
        lenOfLongSubstring lols = new lenOfLongSubstring();
        System.out.println(lols.lengthOfLongestSubstring(s));
    }
}
