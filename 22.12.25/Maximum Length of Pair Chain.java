class Solution {
    public int findLongestChain(int[][] pairs) {
        // Sort pairs by their second element (right value)
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        
        int currentEnd = Integer.MIN_VALUE;
        int count = 0;
        
        for (int[] pair : pairs) {
            if (pair[0] > currentEnd) {
                count++;
                currentEnd = pair[1];
            }
        }
        
        return count;
    }
}
