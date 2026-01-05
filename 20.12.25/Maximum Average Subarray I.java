class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = Arrays.stream(nums, 0, k).sum();
        double max = sum;
        for(int i=k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }
        return max/k;
    }
}
